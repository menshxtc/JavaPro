package Assigments.Module1;

/**
 * @Author mensh
 * @Date 2025/7/15 11:21
 * @Abstract This class is used for testing String.
 */

class Test{
    int a;
    void test_me(int t1){
    }
    void test_me(int t1, int t2){
    }
}

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

//        int a=1;
//        int b=2;
//        a=b;
//        // str1只是改变了引用，原本的“Hello”任然在变量池中
//        str1 = "test";
//        // 上述代码等价于下代码
//        str1 = new String("test");

        String result1 = str1 + ", " + str2;
        System.out.println(result1);

        int[] arrTem = {1,2,3,4};
        System.out.println(arrTem[0]);
        System.out.println(arrTem[1]);
        System.out.println(arrTem.length);


        // 多态 method()
        String subStr_0 = str1.substring(1);
        String result_0 = subStr_0 + "!";
        System.out.println(result_0);

        String subStr_1 = str1.substring(2, 3);
        String result_1 = subStr_1 + "!";
        System.out.println(result_1);

    }
}
