package com.bootcamp;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchValidator implements ConstraintValidator<PasswordMatch, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        if (user == null) {
            return true;
        }
        boolean match = user.getPasswrod() != null && user.getPasswrod().equals(user.getConfirmPassword());
        if (!match) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("The password fields must match")
                .addPropertyNode("passwrod").addConstraintViolation();
            context.buildConstraintViolationWithTemplate("The password fields must match")
                .addPropertyNode("confirmPassword").addConstraintViolation();
        }
        return match;
    }
}
