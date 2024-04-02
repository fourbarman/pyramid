package ru.fourbarman;

public class Validator {
    public static int validate(String[] args) throws IllegalArgumentException {
        if (args.length != 1) {
            throw new IllegalArgumentException("Provide only one argument: integer");
        }
        int num = Integer.parseInt(args[0]);
        if (num < 0) {
            throw new IllegalArgumentException("Number must be grater 0");
        }
        return num;
    }
}
