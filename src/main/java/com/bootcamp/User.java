package com.bootcamp;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@PasswordMatch
public class User {
    @NotBlank(message = "this field cannot empty or null")
    private String usrname;

    @NotBlank(message = "please enter a valid email address")
    @Email(message = "please enter a valid email address")
    private String email;

    private String passwrod;
    private String confirmPassword;

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
