package dev.kata;

public class FizzBuzz {

    public String evaluate(int number) {
        boolean divBy3 = number % 3 == 0;
        boolean divBy5 = number % 5 == 0;
        boolean has3   = String.valueOf(number).contains("3");
        boolean has5   = String.valueOf(number).contains("5");

        boolean isFizz = divBy3 || has3;
        boolean isBuzz = divBy5 || has5;

        if (isFizz && isBuzz) return "FizzBuzz";
        if (isFizz)           return "Fizz";
        if (isBuzz)           return "Buzz";
        return String.valueOf(number);
    }
}