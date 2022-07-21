package tdd.fizzbuzz;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.StringUtils;
import tdd.util.Constant;


public class FizzBuzz {

    @Getter
    @Setter
    private class Index{
        private int currIdx;

        public void resetIdx() {
            currIdx = 0;
        }
    }
    public String countOff(int num) {
        String reData = "";
        reData += isMultiplyOfThree(num) ? Constant.FIZZ : "";
        reData += isMultiplyOfFive(num) ? Constant.BUZZ : "";
        reData += isMultiplyOfSeven(num) ? Constant.WHIZZ : "";
        if (!StringUtils.isEmpty(reData)) {
            return reData;
        } else {
            StringBuilder stringBuilder = new StringBuilder(reData);
            isContain357(num, stringBuilder);
            return StringUtils.isEmpty(stringBuilder.toString()) ?
                    String.valueOf(num) :
                    stringBuilder.toString();
        }
    }


    private void isContain357(int num, StringBuilder reDate) {
        String data = String.valueOf(num);
        for (int idx = 0; idx < data.length(); idx++) {
            char currNum = data.charAt(idx);
            if (currNum == '3') {
                reDate.append(Constant.FIZZ);
            } else if (currNum == '5') {
                reDate.append(Constant.BUZZ);
            } else if (currNum == '7') {
                reDate.append(Constant.WHIZZ);
            }
        }
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
