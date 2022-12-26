package com.day23assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistrationInterface {
    void userCheck();
}

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistrationInterface obj;
        obj = () -> {
            System.out.println("Welcome to User Registration");
        };
        obj.userCheck();
    }
}
