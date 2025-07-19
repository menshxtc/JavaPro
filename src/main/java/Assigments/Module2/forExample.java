package Assigments.Module2;

/**
 * @Author mensh
 * @Date 2025/7/19 18:19
 * @Abstract
 */

public class forExample {
    public static void main(String[] args) {

//        testForLoop();

//        testForEach();

        testIndexOutOfBoundsException();

    }

    private static void testIndexOutOfBoundsException() {
        int[] arr = {1, 2, 3};

        // 错误示例：条件应为 i < arr.length（而非 <=）
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]); // 当i=3时，访问arr[3]导致越界
        }

        // 正确示例：i最大为2（arr.length-1）
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void testForEach() {
        double[] numbers = {1, 3, 5, 7, 9};
        // 语法：for (元素类型 变量名 : 数组/集合)
        for (double num : numbers) {
            System.out.println(num); // 直接获取元素值，无需通过索引
        }
    }

    private static void testForLoop() {
        // 固定循环次数
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //遍历数组
        int[] numbers = {1, 3, 5, 7, 9};
        int sum = 0;
        System.out.println(numbers.length);
        // 遍历数组，i为数组索引
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("数组和：" + sum); // 输出：25

        // 自定义步长循环
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i); // 输出：0, 2, 4, 6, 8, 10
        }
    }
}
