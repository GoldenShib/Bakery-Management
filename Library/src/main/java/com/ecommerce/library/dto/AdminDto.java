package com.ecommerce.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data @NoArgsConstructor @AllArgsConstructor
public class AdminDto {
    @NotBlank(message = "firstname cannot be blank")
    @Size(min = 3, max = 10, message = "Invalid first name!(3-10 characters)")
    private String firstName;

    @NotBlank(message = "lastname cannot be blank")
    @Size(min = 3, max = 10, message = "Invalid first name!(3-10 characters)")
    private String lastName;

    @Email(message = "Invalid email address!")
    @NotBlank(message = "Username cannot be blank")
    private String username;

    @Size(min = 5, max = 15, message = "Invalid password !(5-15 characters)")
    @NotBlank(message = "password cannot be blank")
    private String password;

    private String repeatPassword;
}
