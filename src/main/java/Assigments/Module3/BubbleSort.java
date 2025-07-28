package Assigments.Module3;

import java.util.Scanner;

/**
 * @Author mensh
 * @Date 2025/7/28 19:06
 * @Abstract
 */

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        // 获取数组大小
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        // 创建数组并接收用户输入
        int[] array = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }*/
        int[] array = {8,5,4,2,3};
        int size = array.length;

        // 打印原始数组
        System.out.println("\n开始冒泡排序算法...");
        System.out.print("原始无序数组: ");
        printArray(array);
        System.out.println();

        // 实现冒泡排序算法并展示过程
        for (int i = 0; i < size - 1; i++) {
            System.out.println("\n--- 轮次 " + (i + 1) + " ---");

            for (int j = 0; j < size - i - 1; j++) {
                // 打印当前比较的元素
                System.out.print("比较 [" + array[j] + "] 和 [" + array[j + 1] + "]: ");

                if (array[j] > array[j + 1]) {
                    // 交换元素
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    System.out.print("发生交换 -> ");
                } else {
                    System.out.print("无交换 -> ");
                }

                // 打印当前数组状态
                printArray(array);
                System.out.println();

            }

            // 显示本轮结束后的数组状态
            System.out.print("\n轮次结束后后 " + (i + 1) + ": ");
            printArray(array);

            // 显示已排序的元素
            System.out.println(" (元素 " + (size - i - 1) + " 已经被正确排序)");
        }

        // 打印最终排序结果
        System.out.println("\n排序完成!");
        System.out.print("有序数组: ");
        printArray(array);

        scanner.close();
    }

    // 辅助方法：打印数组
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
