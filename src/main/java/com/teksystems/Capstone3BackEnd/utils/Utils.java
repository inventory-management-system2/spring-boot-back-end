package com.teksystems.Capstone3BackEnd.utils;

import org.springframework.context.annotation.Configuration;

import java.security.SecureRandom;
import java.util.Random;

@Configuration
public class Utils {
    private final Random RANDOM = new SecureRandom();
    private final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234568790";

    public String generateUserId(int length){
        return generateRandomString(length);
    }

    public String generateRandomString(int length){
        StringBuilder returnValue = new StringBuilder(length);
        for (int i = 0; i< length; i++){
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return returnValue.toString();
    }
}
