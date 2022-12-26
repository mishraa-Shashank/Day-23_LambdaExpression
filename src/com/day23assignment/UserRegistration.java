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
            System.out.println("Welcome to User Registration Validation Program using Lambda expression.");

            System.out.println("Enter your first Name : ");
            String firstName = new Scanner(System.in).next();
            System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{3,}$", firstName));

            System.out.println("Enter your last Name : ");
            String lastName = new Scanner(System.in).next();
            System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{3,}$", lastName));

            System.out.println("Enter your email : ");
            String email = new Scanner(System.in).next();
            System.out.println(Pattern.matches(
                    "^[a-zA-Z]{3,}(?=.*[.+-])[a-zA-Z0-9]*[@][a-zA-Z]+[.][a-z]{3,}([_+-.][a-zA-Z])*$", email));

            System.out.println("Enter your phone number: ");
            String phoneNum = new Scanner(System.in).next();
            System.out.println(Pattern.matches("^[+91|0]+[ ]?[6-9]{1}[0-9]{9}$", phoneNum));

            System.out.println("Enter your password : ");
            String password = new Scanner(System.in).next();
            System.out.println(Pattern.matches(
                    "^(?=.*\\d)(?=.*[a-zA-Z])(?=.*[A-Z])(?=.*[-#$%&@]+)(?=.*[a-zA-Z]).{8,}$", password));
        };
        obj.userCheck();
    }
}
