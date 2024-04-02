package ru.fourbarman;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            int num = Validator.validate(args);
            System.out.println("Your pyramid array:" + Arrays.deepToString(Pyramid.pyramid(num)));
        } catch (IllegalArgumentException e) {
            System.out.println("Please, enter positive int number");
        }
    }
}