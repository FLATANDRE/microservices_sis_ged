package com.sgedblk.userprofile.entity;

import com.sgedblk.userprofile.enums.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user_profile")
public class UserProfile {
    @Id
    private String id;
    private String account;
    private String name;
    private String email;
    private String userInfo;
    private UserStatus status;
}