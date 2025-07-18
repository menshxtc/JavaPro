package Assigments.Module2;

import java.util.Scanner;

/**
 * @Author mensh
 * @Date 2025/7/19 18:29
 * @Abstract
 */

public class break_continueExample {
    public static void main(String[] args) {

//        testBreak();

        testContinue();

    }

    private static void testContinue() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // 当i等于5时，跳过后续打印，直接进入下一次循环
            }
            System.out.println(i); // 打印1-4、6-10
        }
    }

    private static void testBreak() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // 当i等于5时，立即终止整个循环
            }
            System.out.println(i); // 只会打印1-4
        }
    }
}
