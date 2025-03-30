package com.example.demo;

import com.example.demo.redis_entity.FIPDetails;
import com.example.demo.redis_repository.FIPDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.demo.redis_repository.FIPDetailsRepository.redisHashKey;

@RestController
@RequestMapping("/FIP")
@EnableCaching
public class FIPController {

    @Autowired
    FIPDetailsRepository fipDetailsRepository;

    @PostMapping("/saveFIPDetails")
    public FIPDetails saveFIPDetails(@RequestBody FIPDetails fipDetails) {
        return fipDetailsRepository.saveFIPDetails(fipDetails);
    }

    /**
     * if you want only Read only purpose you can use @Cacheable
     * if you want Update or delete data in Cache - @CacheEvict
     * if you want Insert data in Cache - @CacheEvict
     * Spring will automatically fetch data from RedisHash for firsttime from 2nd time onwards data fetched from Cache.
     */
    @Cacheable(key = "#fipId", value = redisHashKey)
    @GetMapping("/getFIPDetailsByFIPId/{fipId}")
    public FIPDetails getFipDetailsByFIPId(@PathVariable Integer fipId) {
        return fipDetailsRepository.getFIPDetailsByFIPId(fipId);
    }

    /**
     * Here if i delete data from RedisHash that data immediately deleted from Cache as well for that we have use @CacheEvict
     */
    @CacheEvict(key = "#fipId", value = redisHashKey)
    @DeleteMapping("/deletedFIPDetailsByFIPId/{fipId}")
    public String deleteFipDetailsByFIPId(@PathVariable Integer fipId) {
        return fipDetailsRepository.deleteFIPByFIPId(fipId);
    }

    @GetMapping("/getAllFIPDetails")
    public List<FIPDetails> getAllFIPDetails() {
        return fipDetailsRepository.getFIPDetails();
    }

    /**
     * Conditional Based Caching - instead of Caching all data Conditional Based we are Caching
     * caches fip id not greater than 105. If it is greater than 105, then the result will not be cached and fetched data from RedisHash everytime.
     */
    @Cacheable(key = "#fipId", value = redisHashKey, unless = "#result.fipId > 105")
    @GetMapping("/getFIPDetailsByFIPIdOnCondition/{fipId}")
    public FIPDetails getFIPDetailsByFIPIdOnCondition(@PathVariable Integer fipId) {
        return fipDetailsRepository.getFIPDetailsByFIPId(fipId);
    }
}
