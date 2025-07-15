package Assigments.Module1;

/**
 * @Author mensh
 * @Date 2025/7/15 11:21
 * @Abstract This class is used for testing operators.
 */

public class OperatorExample {

    public static void main(String[] args) {
        System.out.println("===== 算术运算符 =====");
        testArithmeticOperators();

        System.out.println("\n===== 关系运算符 =====");
        testRelationalOperators();

        System.out.println("\n===== 逻辑运算符 =====");
        testLogicalOperators();

        System.out.println("\n===== 位运算符 =====");
        testBitwiseOperators();

        System.out.println("\n===== 赋值运算符 =====");
        testAssignmentOperators();

        System.out.println("\n===== 三元运算符 =====");
        testTernaryOperator();

        System.out.println("\n===== 运算符优先级 =====");
        testOperatorPrecedence();
    }

    // 测试算术运算符
    public static void testArithmeticOperators() {
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b)); // 加法: 13
        System.out.println("a - b = " + (a - b)); // 减法: 7
        System.out.println("a * b = " + (a * b)); // 乘法: 30
        System.out.println("a / b = " + (a / b)); // 除法: 3
        System.out.println("a % b = " + (a % b)); // 取余: 1

        int m = 10;
        double n = 3;
        // 此时Java隐含了一个自动类型转换，将 m 转换为 double
        System.out.println("m / n = " + (m / n)); // 除法: 3.3333
        // m = n; // java: 不兼容的类型: 从double转换到int可能会有损失

        n = n + 0.8;
        System.out.println("(double) n = " + n); // 未强制转换: 3.8
        System.out.println("(int) n = " + (int)n); // 强制转换时舍弃小数位: 3

        int x = 5;
        System.out.println("x++ = " + x++); // 后自增: 5
        System.out.println("++x = " + ++x); // 前自增: 7
    }

    // 测试关系运算符
    public static void testRelationalOperators() {
        int a = 10, b = 20;
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // false
        System.out.println("a < b: " + (a < b));   // true
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a <= b: " + (a <= b)); // true
    }

    // 测试逻辑运算符
    public static void testLogicalOperators() {
        boolean x = true, y = false;
        // 且
        System.out.println("x && y: " + (x && y)); // false
        // 或
        System.out.println("x || y: " + (x || y)); // true
        // 非
        System.out.println("!x: " + (!x));         // false

        // 短路与 vs 非短路与
        int a = 5, b = 10;
        // 左侧为 false 时，右侧不执行
        System.out.println((a > 10) && (b++ > 0)); // false（b不变）
        // 两侧都要执行
        System.out.println((a > 10) & (b++ > 0));  // false（b变为11）
    }

    // 测试位运算符
    public static void testBitwiseOperators() {
        int a = 5;  // 二进制: 0101
        int b = 3;  // 二进制: 0011

        //对应位都为 1 时，结果为 1，否则为 0
        System.out.println("a & b: " + (a & b));   // 按位与: 0001 → 1
        // 对应位只要有一个为 1，结果为 1，否则为 0
        System.out.println("a | b: " + (a | b));   // 按位或: 0111 → 7
        // 对应位不同时结果为 1，相同为 0
        System.out.println("a ^ b: " + (a ^ b));   // 按位异或: 0110 → 6
        // 将每一位取反，0 变 1，1 变 0
        System.out.println("~a: " + (~a));         // 按位取反: 1010 → -6

        int x = 8;  // 二进制: 1000
        System.out.println("x << 1: " + (x << 1)); // 左移1位: 10000 → 16
        System.out.println("x >> 1: " + (x >> 1)); // 右移1位: 0100 → 4
    }

    // 测试赋值运算符
    public static void testAssignmentOperators() {
        int a = 10;
        a += 5;  // 等价于 a = a + 5 → 15
        a -= 3;  // 等价于 a = a - 3 → 12
        System.out.println("a: " + a); // 输出: 12

        // 复合赋值与类型转换
        // 8位带符号的整数
        byte b = 10;

        // 等价于 b = (byte)(b + 5)，带有强制类型转换
        b += 5;      // 正确: 自动类型转换

        // int（32位）转 byte（8位）可能导致精度损失（例如结果超过 byte 范围时）
        // Java中 “5” 整数默认类型为 int
        // b = b + 5; // 错误: 可能损失精度
        System.out.println("b: " + b); // 输出: 15
    }

    // 测试三元运算符
    public static void testTernaryOperator() {
        int score = 85;
        // 判断为真输出第一个，为假输出第二个
        String result = (score >= 60) ? "及格" : "不及格";
        System.out.println("成绩: " + result); // 输出: 及格

        // 嵌套三元运算符
        int num = -5;
        String sign = (num > 0) ? "正数" : ((num < 0) ? "负数" : "零");
        System.out.println("符号: " + sign); // 输出: 负数
    }

    // 测试运算符优先级
    public static void testOperatorPrecedence() {
        // 优先级: 括号 > 乘法 > 加法 > 比较 > 逻辑与 > 逻辑或
        boolean result = (2 + 3 * 4) > 10 && 5 < 6 || false;
        System.out.println("结果: " + result); // 输出: true
    }

}
