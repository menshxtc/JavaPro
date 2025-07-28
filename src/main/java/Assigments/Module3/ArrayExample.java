package Assigments.Module3;

/**
 * @Author mensh
 * @Date 2025/7/21 15:16
 * @Abstract
 */

public class ArrayExample {
    public static void main(String[] args) {

        // 声明变量
        int score;
        // 声明数组，但并未初始化，此时内部存储空间均为 null
        int[] scores;

        // 声明并分配内存
        int[] grades = new int[5];
        // 声明时直接初始化，长度自动分配
        int[] highScores = {99,98,98,88,68};
        String[] names = {"Alice", "Bob", "Charlie"};

        // 数组的使用
        System.out.println("highScores数组的第一个值为："+highScores[0]);
        highScores[0]=100;
        System.out.println("highScores数组的第一个值进行修改："+highScores[0]);
        System.out.println();

        // 数组长度
        System.out.println("数组的长度使用length："+highScores.length);
        System.out.println("String数组的长度使用依然使用length："+names.length);
        System.out.println("String的长度使用length()："+names[0].length());
        System.out.println();

        // 数组遍历
        System.out.println("for循环的数组遍历操作：");
        for (int i = 0; i < highScores.length; i++) {
            System.out.println("第[ "+i+" ]个数组元素的值"+ highScores[i] );
        }

        // 数组遍历越界问题
//        System.out.println("数组的遍历越界问题：");
//        for (int i = 0; i <= highScores.length; i++) {
//            System.out.println("第[ "+i+" ]个数组元素的值"+ highScores[i]); // 当i=3时，访问arr[3]导致越界
//        }

        // for-each遍历数组
        System.out.println("for-each循环的数组遍历操作：");
        for (int value : highScores) {
            System.out.println("数组元素的值"+ value );
        }
    }
}
