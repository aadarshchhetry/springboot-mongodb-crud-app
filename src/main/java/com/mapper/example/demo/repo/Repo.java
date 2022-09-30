package com.mapper.example.demo.repo;

import com.mapper.example.demo.mapper.userEntity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends MongoRepository<UserEntity,Integer> {
}
