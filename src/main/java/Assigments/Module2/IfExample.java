package Assigments.Module2;

/**
 * @Author mensh
 * @Date 2025/7/19 1:25
 * @Abstract
 */

public class IfExample {
    public static void main(String[] args) {

        testLine();

        testIfElse();

        testIfNested();

        testDangling(1,2);

        testOptimize(19,true,true);

    }

    private static void testOptimize(int age, boolean hasID, boolean passTest) {
        // 多层嵌套（可读性差）
        if (age >= 18) {
            if (hasID) {
                if (passTest) {
                    System.out.println("可入职");
                }
            }
        }
        // 优化：合并条件（减少嵌套）
        if (age >= 18 && hasID && passTest) {
            System.out.println("可入职");
        }
    }

    private static void testDangling(int a, int b) {
        // 歧义实例
        if (a > 0)
            if (b > 0)
                System.out.println("a和b都大于0");
        else
            System.out.println("else执行了");
        // 实际执行
        if (a > 0) {
            if (b > 0) {
                System.out.println("a和b都大于0");
            } else { // 与内层 if 绑定
                System.out.println("else执行了");
            }
        }
        // 正确形式
        if (a > 0) { // 外层 if 用花括号明确范围
            if (b > 0) { // 内层 if 用花括号
                System.out.println("a和b都大于0");
            }
        }
        else { // 外层 else，明确与外层 if 绑定
            System.out.println("a≤0时执行");
        }
    }

    private static void testIfNested() {
        int grade = 90;

        if (grade >= 60) {
            if (grade >= 90){
                System.out.println("优秀");
            } else {
                if (grade >= 75) {
                    System.out.println("良好");
                } else {
                    System.out.println("及格");
                }
            }
        }
        else {
            System.out.println("不及格");
        }
    }


    private static void testIfElse() {
        int grade = 22;

        if (grade >= 90) {
            System.out.println("优秀");
        } else if (grade >= 75) { // [75,90)
            System.out.println("良好");
        } else if (grade >= 60) { // [60,75)
            System.out.println("及格");
        }
        else {
            System.out.println("不及格");
        }
    }

    private static void testLine() {
        int i = 10;
        if(i <= 9) System.out.println("无{ }单行if语句执行");

        if(i <= 12){
            System.out.println("有{ }单行if语句执行");
        }

        if(i <= 12){
            i++;
            System.out.println("有{ }多行if语句执行");
        }

        if (i < 8){
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
