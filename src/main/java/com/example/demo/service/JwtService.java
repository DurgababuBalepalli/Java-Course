package com.example.demo.service;

import com.example.demo.models.UserInfo;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a service class which provides JWT token generation and etc
 */
@Component
public class JwtService {
    public static String SECRET_KEY = "5275a3ad7e63dde5b05e773da2e83d337e887bc8a97c96f759e3cd7081f10445fada9712b5da89b58e8a8301a2f39f740028cf0437e5d5f1eb94e16127b616fe";

    /**
     * Here in this method iam passing user name.
     * In JWT Token we have Header, Payload and Verify Signature. These three are called Claims in JWT.
     */
    public String generateToken(String userName) {
        Map<String,Object> claims = new HashMap<>();
        return createToken(claims,userName);
    }

    /**
     * Here iam creating JWT Token.
     */
    private String createToken(Map<String,Object> claims,String userName) {
        long currentTimeInMillis = System.currentTimeMillis();
        Key signKey = getSignKey();
        System.out.println(new Date(currentTimeInMillis));
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(userName)
                .setIssuedAt(new Date(currentTimeInMillis))
                .setExpiration(new Date(currentTimeInMillis + (1000 * 60 * 5)))
                .signWith(signKey, SignatureAlgorithm.HS256)
                .compact();
    }

    /**
     * Here iam providing base64 key.
     */
    private Key getSignKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        Key key = Keys.hmacShaKeyFor(keyBytes);
        return key;
    }

    /**
     * This method will helpful to extract user name from the bearer token. with extracted username we can validate against to DB.
     */
    public String extractUsername(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(getSignKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();
    }

    /**
     * In consequent 3 methods, we are checking token expiration and comparing UI Bearer Token user name with DB Bearer Token User Name
     */
    public boolean validateToken(String token, UserDetails userDetails) {
        String username = extractUsername(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    private boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new java.util.Date());
    }

    private java.util.Date extractExpiration(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(getSignKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
        return claims.getExpiration();
    }
}
