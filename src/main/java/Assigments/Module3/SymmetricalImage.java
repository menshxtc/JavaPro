package Assigments.Module3;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author mensh
 * @Date 2025/7/31 16:30
 * @Abstract
 */

public class SymmetricalImage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 获取用户输入的数组维度
        System.out.print("输入行数量 (n): ");
        int n = scanner.nextInt();
        System.out.print("输入列数量 (m): ");
        int m = scanner.nextInt();
        scanner.close();

        // 创建二维数组用于标记图像点
        boolean[][] image = new boolean[n][m];

        // 计算需要生成的随机点数量
        int numPoints = (n * m) / 4;

        // 生成随机点并标记其对称点
        for (int p = 0; p < numPoints; p++) {
            // 生成随机行索引
            int row = random.nextInt(n);
            // 生成随机列索引
            int col = random.nextInt(m);

            // 标记当前点
            image[row][col] = true;

            // 计算垂直对称点的列索引
            int mirroredCol = m - 1 - col;

            // 标记对称点（如果与当前点不同）
            if (mirroredCol != col) {
                image[row][mirroredCol] = true;
            }
        }

        // 打印生成的对称图像
        System.out.println(n+"行"+m+"列 垂直对称图形随机生成如下：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 标记的点打印"*"，否则打印空格
                System.out.print(image[i][j] ? "*" : " ");
            }
            // 每行结束后换行
            System.out.println();
        }
    }
}
