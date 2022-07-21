package tdd.fizzbuzz;

import tdd.util.Constant;


public class FizzBuzz {

    public String countOff(int num) {
        String reData = "";
        reData += isMultiplyOfThree(num) ? Constant.FIZZ : "";
        reData += isMultiplyOfFive(num) ? Constant.BUZZ : "";
        reData += isMultiplyOfSeven(num) ? Constant.WHIZZ : "";
        return reData.equals("") ? String.valueOf(num) : reData;
    }


    private boolean isMultiplyOfThree(int num) {
        return num % 3 == 0;
    }
    private boolean isMultiplyOfFive(int num) {
        return num % 5 == 0;
    }
    private boolean isMultiplyOfSeven(int num) {
        return num % 7 == 0;
    }
}
