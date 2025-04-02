package com.example.demo.repositories;

import com.example.demo.models.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long>{
    Optional<UserInfo> getUserInfoByUserName(String userName);
}
