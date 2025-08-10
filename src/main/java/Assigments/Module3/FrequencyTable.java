package Assigments.Module3;

import java.util.Scanner;

/**
 * @Author mensh
 * @Date 2025/7/31 16:17
 * @Abstract
 */

public class FrequencyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 获取用户输入的骰子数量
        System.out.print("请输入骰子数量： ");
        int numDice = scanner.nextInt();
        scanner.close();

        // 计算可能的总和范围
        int minSum = numDice;          // 最小总和：每个骰子都掷出1
        int maxSum = numDice * 6;      // 最大总和：每个骰子都掷出6
        int arraySize = maxSum - minSum + 1;  // 频率数组大小
        int rollTimes = 10000;

        // 创建频率数组，用于记录每个总和出现的次数
        int[] frequency = new int[arraySize];

        // 模拟10000次投掷
        for (int i = 0; i < rollTimes; i++) {
            int sum = 0;
            // 每次投掷所有骰子并计算总和
            for (int j = 0; j < numDice; j++) {
                // 生成1-6的随机数（模拟掷一个6面骰子）
                int roll = (int) (Math.random() * 6) + 1;
                sum += roll;
            }
            // 更新频率数组：索引 = 总和 - 最小可能值
            frequency[sum - minSum]++;
        }

        // 打印频率表结果
        System.out.println();
        System.out.println(numDice+"个骰子在"+ rollTimes +"次投掷中各点数对应的出现频率：");
        for (int i = 0; i < frequency.length; i++) {
            int sumValue = minSum + i;
            System.out.println("点数："+sumValue + " 出现频率：" + frequency[i]);
        }
        System.out.println();
    }
}
