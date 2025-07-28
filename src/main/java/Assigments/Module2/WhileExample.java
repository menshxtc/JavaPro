package Assigments.Module2;

import java.util.Scanner;

/**
 * @Author mensh
 * @Date 2025/7/19 18:00
 * @Abstract
 */

public class WhileExample {
    public static void main(String[] args) {

//        int count = 0;
//        while (count<=10) {
//            System.out.print(count + " ");
//            count += 2;
//        }

        // 重复执行直到满足某个条件
        testConditionLoop();

        // 已知终止条件但次数不固定
//        testCountLoop();

        // 重复执行直到外部状态变化
//        testControlLoop();

        // 测试 do-while 循环
//        testDoWhile();

    }

    private static void testDoWhile() {
        int a = 5;
        // while 循环：条件不满足则不执行
        while (a < 3) {
            System.out.println("while 执行"); // 不执行
        }

        // do-while 循环：先执行再判断
        int b = 5;
        do {
            System.out.println("do-while 执行, b = "+ b); // 执行一次
            b++;
        } while (b < 3);
    }

    private static void testControlLoop() {
        boolean isPlaying = true;
        Scanner scanner = new Scanner(System.in);

        // 游戏主循环：玩家未退出则持续运行
        while (isPlaying) {
            System.out.println("游戏中...（输入'quit'退出）");
            String input = scanner.nextLine();

            // 若输入quit，修改条件变量退出循环
            if (input.equals("quit")) {
                isPlaying = false;
            }
        }
        System.out.println("游戏结束！");
    }

    private static void testCountLoop() {
        int sum = 0;
        int num = 1;
        // 循环：sum未超过100时，持续累加
        while (sum <= 100) {
            sum += num; // 累加num到sum
            num++; // 更新num（避免重复加同一个数）
        }
        System.out.println("累加和超过100时的总和：" + sum); // 结果：105（1+2+...+14=105）
    }

    private static void testConditionLoop() {
        Scanner scanner = new Scanner(System.in);
        int age;

        // 循环：直到输入1-120之间的年龄
        while (true) { // 条件恒为true，形成“无限循环”
            System.out.print("请输入年龄（1-120）：");
            age = scanner.nextInt();

            // 若输入合法，用break退出循环
            if (age >= 1 && age <= 120) {
                break;
            } else {
                System.out.println("年龄无效，请重新输入！");
            }
        }
        System.out.println("您的年龄是：" + age);
    }
}
