package com.sgedblk.userprofile.dto;

import com.sgedblk.userprofile.enums.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileDTO {
    private String id;
    private String account;
    private String name;
    private String email;
    private String userInfo;
    private UserStatus status;
}
