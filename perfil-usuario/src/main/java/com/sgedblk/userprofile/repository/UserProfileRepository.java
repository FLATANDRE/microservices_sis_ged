package com.sgedblk.userprofile.repository;

import com.sgedblk.userprofile.entity.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserProfileRepository extends MongoRepository<UserProfile, String> {

    UserProfile findByAccount(String account);
}
