package br.com.E3N.combinatorPattern.v2;

import java.util.Collections;

public class UserValidators {

    public static Validator<User> defaultValidator(){
        return emailContainsAt()
                .and(passwordLongEnough())
                .and(isFullName());
    }

    private static Validator<User> emailContainsAt(){
        return user -> user.getEmail().contains("@")
                ? ValidationResult.ok()
                : ValidationResult.fail("Invalid email");
    }

    private static Validator<User> passwordLongEnough() {
        return user -> user.getPassword().length() >= 8
                ? ValidationResult.ok()
                : ValidationResult.fail("Password too short");
    }

    private static Validator<User> isFullName(){
        return user -> user.getName().trim()
                .contains(" ")
                ? ValidationResult.ok()
                : ValidationResult.fail("Must give the full name");
    }
}
