package Assigments.Module5;

/**
 * @Author mensh
 * @Date 2025/8/10 17:08
 * @Abstract
 */

public class CommentExample {

    // 常量定义：英寸到厘米的转换系数（单行注释：解释常量含义）
    private static final double INCH_TO_CM = 2.54;

    /**
     * 将英寸转换为厘米
     *
     * @param inches 输入的英寸值（必须为非负数）
     * @return 转换后的厘米值，若输入为负数则返回0.0
     */
    public static double convertInchToCm(double inches) {
        // 验证输入合法性（单行注释：说明分支逻辑）
        if (inches < 0) {
            System.out.println("错误：输入的英寸值不能为负数");
            return 0.0; // 非法输入返回0
        }

        /*
         * 执行转换计算
         * 公式：厘米 = 英寸 × 2.54
         * （多行注释：解释复杂计算逻辑）
         */
        return inches * INCH_TO_CM;
    }

    /**
     * 计算两个整数的最大公约数（GCD）
     * 使用欧几里得算法：gcd(a,b) = gcd(b,a mod b)
     *
     * @param a 第一个整数（非负）
     * @param b 第二个整数（非负）
     * @return 两个数的最大公约数，若输入为负数则返回-1
     */
    public static int calculateGCD(int a, int b) {
        // 处理异常输入（负数）
        if (a < 0 || b < 0) {
            return -1;
        }
        // 欧几里得算法实现
        // 当b不为0时，循环计算余数
        while (b != 0) {
            int temp = b;    // 临时存储b的值
            b = a % b;       // 计算a除以b的余数，更新b
            a = temp;        // 更新a为原来的b
        }
        return a; // 此时a即为最大公约数
    }

    /**
     * 程序入口方法
     * 演示注释中定义的工具方法的使用
     *
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {
        // 演示英寸转厘米方法
        double cm = convertInchToCm(10);
        System.out.println("10英寸 = " + cm + "厘米");

        // 演示最大公约数计算
        int gcd = calculateGCD(24, 18);
        System.out.println("24和18的最大公约数是：" + gcd);
    }

}
