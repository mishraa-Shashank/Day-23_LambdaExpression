package com.day23assignment;

@FunctionalInterface
interface UserRegistrationInterface {
    void userCheck();
}

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistrationInterface obj;
        obj = () -> {
            System.out.println("Welcome to User Registration Validation Program using Lambda expression.");
        };
        obj.userCheck();
    }
}
