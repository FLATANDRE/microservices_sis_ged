package com.sgedblk.userprofile.service;

import com.sgedblk.userprofile.entity.UserProfile;

import java.util.List;

public interface UserProfileService {

    UserProfile findByAccount(String account);
    UserProfile saveOrUpdate(UserProfile userProfile);

}
