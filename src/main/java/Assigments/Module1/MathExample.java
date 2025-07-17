package Assigments.Module1;

/**
 * @Author mensh
 * @Date 2025/7/17 19:01
 * @Abstract
 */

public class MathExample {
    public static void main(String[] args) {

        // Static 静态
        // Math math = new Math();

        System.out.println("圆周率："+Math.PI);         // 圆周率 π，约 3.14159
        System.out.println("自然对数底数为："+Math.E);   // 自然对数的底数 e，约 2.71828

        double x = 2.6;
        double y = -3.7;
        double z = 3;

        // 绝对值
        System.out.println(Math.abs(y));  // 3.7
        // 平方
        System.out.println(Math.pow(z,3));  // 8
        // 平方根
        System.out.println(Math.sqrt(z));  // 2
        // 向上取整
        System.out.println(Math.ceil(x));  // 3.0
        // 向下取整
        System.out.println(Math.floor(x)); // 2.0
        // 四舍五入
        System.out.println(Math.round(x)); // 3 (返回 long 类型)

        // 生成 [0, 1] 之间的随机 double 值
        double random = Math.random();
        System.out.println(random);

        // 生成 [1, 10] 之间的随机整数
        int randomInt = (int) (Math.random() * 10) + 1;
        System.out.println(randomInt);

    }
}
