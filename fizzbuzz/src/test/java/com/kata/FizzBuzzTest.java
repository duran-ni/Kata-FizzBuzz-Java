package com.kata;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void returns_fizz_when_divisible_by_3() {
        assertThat(fizzBuzz.evaluate(3), is("Fizz"));
        assertThat(fizzBuzz.evaluate(9), is("Fizz"));
    }

    @Test
    void returns_buzz_when_divisible_by_5() {
        assertThat(fizzBuzz.evaluate(5), is("Buzz"));
        assertThat(fizzBuzz.evaluate(10), is("Buzz"));
    }

    @Test
    void returns_fizzbuzz_when_divisible_by_3_and_5() {
        assertThat(fizzBuzz.evaluate(15), is("FizzBuzz"));
        assertThat(fizzBuzz.evaluate(30), is("FizzBuzz"));
    }

    @Test
    void returns_number_otherwise() {
        assertThat(fizzBuzz.evaluate(1), is("1"));
        assertThat(fizzBuzz.evaluate(7), is("7"));
    }
}