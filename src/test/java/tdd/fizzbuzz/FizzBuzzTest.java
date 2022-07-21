package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void should_output_Fizz_when_multiple_3_given_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String out  = fizzBuzz.countOff(3);

        String except = "Fizz";
        //then
        assertThat(out).isEqualTo(except);
    }

}
