package Assigments.Module3;

import java.util.Scanner;

/**
 * @Author mensh
 * @Date 2025/7/28 16:42
 * @Abstract
 */

public class Sieve {
    public static void main(String[] args) {
        // 提示用户输入n
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数n，将找出所有不大于n的质数：");
        int n = scanner.nextInt();
        scanner.close();

        // 创建布尔数组表示数字是否为质数，索引对应数字，初始假设所有数字为质数
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 执行埃拉托斯特尼筛法
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) { // 若i是质数，标记其所有倍数为非质数
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 打印所有质数
        System.out.println(n + "以内的质数有：");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
