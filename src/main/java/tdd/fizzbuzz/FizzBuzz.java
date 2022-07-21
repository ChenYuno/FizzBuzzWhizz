package tdd.fizzbuzz;

import tdd.util.Constant;

/**
 * 你是一名体育老师。在下课前五分钟，你决定和你班上的所有学生玩一个游戏。  规则如下：
 *  让所有学生排成一列，每个人都按顺序倒数。
 *  倒数时，如果数字是第一个特殊数字三（3）的倍数，那么学生应该说Fizz；  如果该数字是第二个特殊数字的倍数，则为五 (5)，例如 Buzz；  如果是第三个特殊数字的倍数，即七 (7) 号，请说 Whizz。
 *  倒计时时，如果数字是两个特殊数字的倍数，例如。  第一个和第二个数字，然后学生应该说 FizzBu​​zz 而不是这个数字，依此类推。  如果数字是三个特殊数字的倍数，请说 FizzBu​​zzWhizz。
 *  现在你需要设计一个程序来模拟这个游戏。  输出应该是输出片段：
 */
public class FizzBuzz {

    public String countOff(int num) {
        return isMultiplyThree(num) ? Constant.FIZZ : "";
    }


    private boolean isMultiplyThree(int num) {
        return num % 3 == 0;
    }
}
