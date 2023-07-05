package com.sgedblk.userprofile.controller;

import com.sgedblk.userprofile.dto.UserProfileDTO;
import com.sgedblk.userprofile.entity.UserProfile;
import com.sgedblk.userprofile.service.UserProfileService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@AllArgsConstructor
@RestController
@RequestMapping("/profile")
public class UserProfileController {

    private UserProfileService userProfileService;
    private ModelMapper modelMapper;

    @GetMapping(value = "/{account}")
    public UserProfileDTO findByAccount(@PathVariable String account) {
        UserProfile user = userProfileService.findByAccount(account);
        if (Objects.isNull(user)) return null;
        return modelMapper.map(user, UserProfileDTO.class);
    }

    @PostMapping(consumes = "application/json")
    public UserProfileDTO saveUserProfile(@RequestBody UserProfileDTO userProfileDTO) {
        UserProfile userProfile = userProfileService.saveOrUpdate(modelMapper.map(userProfileDTO,UserProfile.class));
        return modelMapper.map(userProfile,UserProfileDTO.class);
    }

}