package com.ecommerce.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    @NotBlank(message = "firstname cannot be blank")
    @Size(min = 3, max = 15, message = "First name should have 3-15 characters")
    private String firstName;

    @NotBlank(message = "lastname cannot be blank")
    @Size(min = 3, max = 15, message = "Last name should have 3-15 characters")
    private String lastName;

    @NotBlank(message = "Username cannot be blank")
    private String username;

    @NotBlank(message = "password cannot be blank")
    @Size(min = 5, max = 20, message = "Password should have 5-20 characters")
    private String password;

    private String repeatPassword;
}
