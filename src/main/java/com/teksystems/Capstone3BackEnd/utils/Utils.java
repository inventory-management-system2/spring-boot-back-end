package com.teksystems.Capstone3BackEnd.utils;

import org.springframework.context.annotation.Configuration;

import java.security.SecureRandom;
import java.util.Random;

@Configuration
public class Utils {
    private final Random RANDOM = new SecureRandom();
    private final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNPQRSTUVWXYZ123456879";

    public String generateSerialNumber(int length){
        return generateRandomString(length);
    }

    public String generateRandomString(int length){
        StringBuilder returnValue = new StringBuilder(length);
        for (int i = 0; i< length; i++){
            if (i % 5 == 0){
                returnValue.append("-");
            }
            returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return returnValue.toString();
    }
}
