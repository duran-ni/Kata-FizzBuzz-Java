package dev.kata;

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

    @Test
    void returns_fizz_when_number_contains_3() {
        assertThat(fizzBuzz.evaluate(13), is("Fizz")); // contiene 3
        assertThat(fizzBuzz.evaluate(31), is("Fizz")); // contiene 3
    }

    @Test
    void returns_buzz_when_number_contains_5() {
        assertThat(fizzBuzz.evaluate(25), is("Buzz")); // contiene 5
        assertThat(fizzBuzz.evaluate(52), is("Buzz")); // contiene 5
    }

    @Test
    void returns_fizzbuzz_when_contains_both_3_and_5() {
        assertThat(fizzBuzz.evaluate(35), is("FizzBuzz")); // contiene 3 y 5
    }
}