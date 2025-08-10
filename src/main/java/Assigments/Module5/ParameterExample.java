package Assigments.Module5;

/**
 * @Author mensh
 * @Date 2025/8/9 19:33
 * @Abstract
 */

public class ParameterExample {
    // 1. 带参数的静态方法：打印Old MacDonald歌曲段落
    public static void verse(String animal, String noise) {
        System.out.println("Old MacDonald had a farm");
        System.out.println("E-I-E-I-O");
        System.out.println("And on that farm he had a " + animal);
        System.out.println("E-I-E-I-O");
        System.out.println("With a " + noise + "-" + noise + " here");
        System.out.println("And a " + noise + "-" + noise + " there");
        System.out.println("Here a " + noise + ", there a " + noise);
        System.out.println("Everywhere a " + noise + "-" + noise);
        System.out.println("Old MacDonald had a farm");
        System.out.println("E-I-E-I-O\n");
    }

    // 2. 带参数的工资计算方法
    // 此处未形式参数，仅仅在函数内使用
    public static void calculatePay(String employee, double hourlyRate, double hoursWorked) {
        double weeklyPay = hourlyRate * hoursWorked; // 局部变量
        System.out.println(employee + ": " + weeklyPay);
    }

    // 3. 方法重载示例（同一方法名，不同参数类型/数量）
    public static void printInfo(String name) {
        System.out.println("Name: " + name);
    }
    public static void printInfo(int age) {
        System.out.println("Age: " + age);
    }
    public static void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // 4. 值传递演示方法
    public static void modifyValue(int x) {
        x = x * 2; // 修改形式参数，不影响外部实际参数
        System.out.println("方法内修改后的值: " + x);
    }

    // 5. 嵌套调用实例
    // 函数1：将英寸转换为厘米，并调用函数2打印结果
    public static void inchesToCentimeters(double inches) {
        double cm = inches * 2.54;
        printResult(inches, cm); // 调用函数2，传递参数inches和cm
    }
    // 函数2：打印转换结果
    public static void printResult(double in, double cm) {
        System.out.println(in + "英寸 = " + cm + "厘米");
    }

    public static void main(String[] args) {
        // 调用verse方法，传入实际参数
        System.out.println("--- 歌曲段落演示 ---");
        verse("cow", "moo"); // 实际参数："cow"和"moo"
        verse("duck", "quack"); // 实际参数："duck"和"quack"

        // 调用工资计算方法
        System.out.println("\n--- 工资计算演示 ---");
        // 此处传递的是实际参数
        calculatePay("Fred", 12.50, 20);
        calculatePay("Amir", 15.0, 35);

        // 调用重载方法
        System.out.println("\n--- 方法重载演示 ---");
        printInfo("Alice");
        printInfo(25);
        printInfo("Bob", 30);

        // 演示值传递
        System.out.println("\n--- 值传递演示 ---");
        int num = 5;
        System.out.println("调用前的值: " + num);
        modifyValue(num); // 传入实际参数num
        System.out.println("调用后的值: " + num); // 原值不变

        // 函数调用链：main → inchesToCentimeters → printResult
        inchesToCentimeters(10); // 输出：10.0英寸 = 25.4厘米
    }
}