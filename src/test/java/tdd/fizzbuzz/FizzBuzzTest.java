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


}
