package Assigments.Module2;

/**
 * @Author mensh
 * @Date 2025/7/28 9:40
 * @Abstract
 */

public class EstimatePi {
    public static void main(String[] args) {
        int N = 1000000;
        int countInside = 0;

        for (int i = 0; i < N; i++) {
            double x = Math.random();
            double y = Math.random();
            if (x*x + y*y <= 1) { // 点在圆内
                countInside++;
            }
        }

        double piEstimate = 4.0 * countInside / N;
        double error = Math.abs(piEstimate - Math.PI);

        System.out.printf("估算值: %.6f, 真实值: %.6f, 误差: %.6f%n",
                piEstimate, Math.PI, error);
    }
}
