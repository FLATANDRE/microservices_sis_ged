package com.sgedblk.userprofile.service.impl;

import com.sgedblk.userprofile.entity.UserProfile;
import com.sgedblk.userprofile.repository.UserProfileRepository;
import com.sgedblk.userprofile.service.UserProfileService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserProfileServiceImpl implements UserProfileService {
    private UserProfileRepository userProfileRepository;

    @Override
    public UserProfile findByAccount(String account) {
        return userProfileRepository.findByAccount(account);
    }

    @Override
    public UserProfile saveOrUpdate(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

}
