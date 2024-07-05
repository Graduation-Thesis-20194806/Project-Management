package com.thesis.taskflow.dtos.loginAndRegister;

import lombok.Data;

@Data
public class ChangePasswordRequest {
    private String oldPassword;
    private String newPassword;
}
