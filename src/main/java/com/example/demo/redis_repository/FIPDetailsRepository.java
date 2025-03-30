package com.example.demo.redis_repository;

import com.example.demo.redis_entity.FIPDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FIPDetailsRepository {
    public static final String redisHashKey = "FIPDetails";

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * In this scenario redisTemplate stores data in Redis Hash. So Retrieves from Redis Hash everytime. we havenot kept data till now at Cache.
     * For every retreival data will be fetched from Redis Hash not from the Cache.
     * In order aquire data from Cache you have to use @Enablecaching and @cashing anotations.
     */
    public FIPDetails saveFIPDetails(FIPDetails fipDetails) {
        redisTemplate.opsForHash().put(redisHashKey,fipDetails.getFipId(),fipDetails);
        return  fipDetails;
    }

    public List<FIPDetails> getFIPDetails() {
        return redisTemplate.opsForHash().values(redisHashKey);
    }

    public FIPDetails getFIPDetailsByFIPId(Integer fipId) {
        System.out.println("Data will be Returned from Redis Hash first time only to keep in Cache...Spring will cache it");
        return (FIPDetails) redisTemplate.opsForHash().get(redisHashKey,fipId);
    }

    public String deleteFIPByFIPId(Integer fipId) {
        redisTemplate.opsForHash().delete(redisHashKey,fipId);
        return "fip deleted successfully..."+fipId;
    }
}
