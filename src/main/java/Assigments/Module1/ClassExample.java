package Assigments.Module1;

/**
 * @Author mensh
 * @Date 2025/7/17 20:43
 * @Abstract
 */


// 类 Class
class Boy{
    private int height = 190;
    double weight = 170;
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    // Class Instructor
//    public Boy(int a, double b){
//        height = a;
//        weight = b;
//    }
}

class Girl{
    private int height;
}

public class ClassExample {
    public static void main(String[] args) {

        int a = 1;

        String str = new String("test");

        String str_1 = "test";

        // 实例化对象
        Boy wjl = new Boy();
        wjl.setHeight(180);
        System.out.println(wjl.getHeight());

        Boy msc = new Boy();

    }
}
