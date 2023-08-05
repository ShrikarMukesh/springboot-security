package com.client;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

    public static void main(String[] args) {

        int strength = 11;
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(strength);

        // Plain password
        String password = "password";

        // Generate hashed password
        String hashedPassword = bCryptPasswordEncoder.encode(password);

        System.out.println(hashedPassword);
    }
}
