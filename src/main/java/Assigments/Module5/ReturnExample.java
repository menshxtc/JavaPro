package Assigments.Module5;

import java.util.Random;

/**
 * @Author mensh
 * @Date 2025/8/10 16:41
 * @Abstract
 */

public class ReturnExample {
    // 1. 返回基本类型（int）：计算两数之和
    public static int add(int a, int b) {
        int sum = a + b;
        return sum; // 返回int类型结果
    }

    // 2. 返回基本类型（double）：计算圆的面积（π×r²）
    public static double calculateCircleArea(double radius) {
        // 处理异常情况：半径为负数时返回0
        if (radius < 0) {
            System.out.println("错误：半径不能为负数！");
            return 0.0; // 提前返回，终止方法
        }
        return Math.PI * radius * radius; // 返回计算后的面积
    }

    // 3. 返回布尔类型（boolean）：判断是否为质数
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 1及以下不是质数
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // 能被整除，不是质数
            }
        }
        return true; // 是质数
    }

    // 4. 返回字符串（String）：生成问候语
    public static String getGreeting(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Guest!"; // 无姓名时返回默认问候
        }
        return "Hello, " + name + "!"; // 带姓名的问候
    }

    // 5. 返回数组（int[]）：生成指定范围的随机整数数组
    public static int[] generateRandomArray(int length, int min, int max) {
        if (length <= 0) {
            return new int[0]; // 返回空数组（避免null）
        }
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            // 生成[min, max]范围内的随机数
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array; // 返回生成的数组
    }

    // 6. void方法（无返回值）：仅打印信息
    public static void printMessage(String message) {
        System.out.println("消息：" + message);
        // 无return语句（或可写return;表示结束）
    }

    public static void main(String[] args) {
        // 场景1：接收返回值并存储到变量
        int sum = add(3, 5);
        System.out.println("3 + 5 = " + sum); // 输出：3 + 5 = 8

        // 场景2：直接使用返回值打印
        double area = calculateCircleArea(2.5);
        System.out.println("半径2.5的圆面积：" + area); // 输出：约19.6349...

        // 场景3：返回值作为条件判断
        int testNum = 17;
        if (isPrime(testNum)) {
            System.out.println(testNum + "是质数"); // 输出：17是质数
        } else {
            System.out.println(testNum + "不是质数");
        }

        // 场景4：返回值作为其他方法的参数
        String greeting = getGreeting("Alice");
        printMessage(greeting); // 输出：消息：Hello, Alice!

        // 场景5：处理返回的数组
        int[] randomNums = generateRandomArray(5, 10, 20);
        System.out.print("随机数组：");
        for (int num : randomNums) {
            System.out.print(num + " "); // 输出：5个10-20的随机数
        }

        // 场景6：测试异常返回（负数半径）
        calculateCircleArea(-1.0); // 输出：错误：半径不能为负数！
    }
}
