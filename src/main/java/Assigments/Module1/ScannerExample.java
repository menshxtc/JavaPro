package Assigments.Module1;

import java.util.Scanner;

/**
 * @Author mensh
 * @Date 2025/7/15 11:21
 * @Abstract This class is used for testing Scanner.
 * The class constructor is used inside.
 */

class nextLineTest{
    public nextLineTest(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个整数: ");
        // 当你输入 123 并按下回车键时，实际输入缓冲区中的内容是 "123\n"
        int num = scanner.nextInt();
        // scanner.nextInt()读取了 123，但换行符 \n 仍留在缓冲区中
        // scanner.nextLine();  // 消耗掉残留的换行符

        System.out.print("请输入一行文本: ");
        // 如果部消耗掉残留的换行符，则下函数会读取残留的 \n
        String line = scanner.nextLine();

        System.out.println("你输入的整数是: " + num);
        System.out.println("你输入的文本是: " + line);

        scanner.close();
    }
}

public class ScannerExample {
    public static void main(String[] args) {

        scannerTest();
        // 缓冲区测试
        nextLineTest bufferTest = new nextLineTest();
    }

    private static void scannerTest() {
        // Alt + Enter 可以自动补全包
        // 创建 Scanner 对象，关联标准输入流（键盘）
        Scanner scanner = new Scanner(System.in);

        // 读取整数
        System.out.print("请输入一个整数: ");
        int num = scanner.nextInt();
        System.out.println("你输入的整数是: " + num);

        // 读取浮点数
        System.out.print("请输入一个小数: ");
        double decimal = scanner.nextDouble();
        System.out.println("你输入的小数是: " + decimal);

        // 读取字符串（遇到空格停止）
        System.out.print("请输入一个单词: ");
        String word = scanner.next();
        System.out.println("你输入的单词是: " + word);

        // 读取整行（包括空格）
        System.out.print("请输入一行文本: ");
        scanner.nextLine(); // 消耗掉上一次输入的换行符
        String line = scanner.nextLine();
        System.out.println("你输入的整行是: " + line);

        // 关闭资源
        scanner.close();
    }
}
