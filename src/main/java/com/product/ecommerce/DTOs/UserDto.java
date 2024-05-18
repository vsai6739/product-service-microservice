package com.product.ecommerce.DTOs;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class UserDto {
    private String name;
    private String password;
    private String email;
    private List<Role> roles;
    private boolean isEmailVerified;
}

