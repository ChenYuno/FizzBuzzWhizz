package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {


    @Test
    void should_output_Fizz_when_multiple_of_3_given_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String out  = fizzBuzz.countOff(3);
        //then
        String except = "Fizz";
        assertThat(out).isEqualTo(except);
    }

    @Test
    void should_output_Buzz_when_multiply_of_5_given_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String output = fizzBuzz.countOff(5);
        //then
        String except = "Buzz";
        assertThat(output).isEqualTo(except);
    }

    @Test
    void should_output_Whizz_when_multiple_of_7_given_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String output = fizzBuzz.countOff(7);
        //then
        String except = "Whizz";
        assertThat(output).isEqualTo(except);
    }

    @Test
    void should_output_FizzBuzz_when_multiple_of_3_and_5_given_15() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String output = fizzBuzz.countOff(15);
        //then
        String except = "FizzBuzz";
        assertThat(output).isEqualTo(except);
    }

    @Test
    void should_output_FizzWhizz_when_multiple_of_3_and_7_given_21() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String output = fizzBuzz.countOff(21);
        //then
        String except = "FizzWhizz";
        assertThat(output).isEqualTo(except);
    }

    @Test
    void should_output_default_number_when_not_multiple_of_3_and_5_and_7_given_2() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String output = fizzBuzz.countOff(2);
        //then
        String except = "2";
        assertThat(output).isEqualTo(except);
    }

    @Test
    void should_output_FizzBuzzWhizz_when_multiple_of_3_and_5_and_7_given_210() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String output = fizzBuzz.countOff(210);
        //then
        String except = "FizzBuzzWhizz";
        assertThat(output).isEqualTo(except);
    }


    @Test
    void should_output_BuzzFizz_when_Contain_3_and_5_given_53() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String output = fizzBuzz.countOff(53);
        //then
        String except = "BuzzFizz";
        assertThat(output).isEqualTo(except);
    }


}
