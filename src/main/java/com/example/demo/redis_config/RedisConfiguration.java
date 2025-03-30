package com.example.demo.redis_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@EnableRedisRepositories
public class RedisConfiguration {

    /**
     * Instanciate jedis connection factory and we need to specify redis host and port
     * JedisConnectionFactory will help us to establish connection with redis server
     */
    @Bean
    public JedisConnectionFactory jedisConnectionFactory() {
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
        redisStandaloneConfiguration.setHostName("localhost");
        redisStandaloneConfiguration.setPort(6379);

        return  new JedisConnectionFactory(redisStandaloneConfiguration);
    }

    /**
     * Now inorder to access redis server we have to instatiate a template. you can think like if you want to integrate sms vendor yuu require a template.
     * for template you have to pass connectionFactory,key serilizer and value serilizer
     * Redis stores key-value pairs within a Redis key.Thimk like nestedMap ex : Map<key, Map<Key,Value>>.Redis hash key used to get hash of inside hashkey (simply inside map hashkey)
     * you can use different serializers aswell (e.g., JdkSerializationRedisSerializer or Jackson2JsonRedisSerializer)
     * After All properties set you have to return the template.
     * Use StringRedisSerializer if your keys are simple string values.
     * Use JdkSerializationRedisSerializer only if you need to serialize Java objects as keys (which is uncommon). since we are storing java objects as keys we are using this one
     * JdkSerializationRedisSerializer will override the StringRedisSerializer here.
     */

    @Bean
    public RedisTemplate<String,Object> redisTemplate() {
        RedisTemplate<String,Object> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory());
        template.setKeySerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new JdkSerializationRedisSerializer());
        template.setValueSerializer(new JdkSerializationRedisSerializer());
        template.setEnableTransactionSupport(true);
        template.afterPropertiesSet();

        return template;
    }
}

