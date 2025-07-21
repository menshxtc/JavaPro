package Assigments.Module3;

/**
 * @Author mensh
 * @Date 2025/7/21 16:48
 * @Abstract
 */

public class Array2DExample {
    public static void main(String[] args) {
        // 数组初始化
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10,11,12}
        };

        // 声明了一个 int 类型的二维数组变量，但未创建数组对象
        int[][] my2DArray;
        // 创建二维数组对象，包含 3 个一维数组（可后续再初始化每个一维数组长度 ）
        my2DArray = new int[3][];
        // 此时变量指向数组对象，打印会输出类似 [[I@1b6d3586 这样的对象引用标识
        System.out.println(my2DArray);

        // 不规则数组
        int[][] jaggedArray = new int[3][];  // 初始化外层数组，长度为3
        jaggedArray[0] = new int[5];         // 第一行：长度5
        jaggedArray[1] = new int[10];        // 第二行：长度10
        jaggedArray[2] = new int[3];         // 第三行：长度3

        // 二维数组行列数值
        System.out.println("数组行数："+matrix.length);
        System.out.println("数组列数："+matrix[0].length);

        // 二维数组遍历
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}
