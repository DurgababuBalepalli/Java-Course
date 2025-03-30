package com.example.demo.redis_entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("FIPDetails") //inside redis this table name will be stored.
public class FIPDetails implements Serializable {
    @Id
    private Integer fipId;

    private String fipName;

    private String fipUrl;
}
