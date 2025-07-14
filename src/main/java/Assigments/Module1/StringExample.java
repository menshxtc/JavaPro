package Assigments.Module1;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // str1只是改变了引用，原本的“Hello”任然在变量池中
        str1 = "test";
        // 上述代码等价于下代码
        str1 = new String("test");

        String result1 = str1 + ", " + str2;
        System.out.println(result1);

        String subStr_0 = str1.substring(0);
        String result_0 = subStr_0 + "!";
        System.out.println(result_0);

        String subStr_1 = str1.substring(2, 4);
        String result_1 = subStr_1 + "!";
        System.out.println(result_1);
    }
}
