package Assigments.Module5;

/**
 * @Author mensh
 * @Date 2025/8/9 19:11
 * @Abstract
 */



public class MethodExample {
    // 定义静态方法：打印歌曲的副歌部分
    public static void chorus() {
        System.out.println("副歌1");
        System.out.println("副歌2");
        System.out.println(); // 空行分隔
    }

    // 定义静态方法：打印歌曲的 music 部分
    public static void music() {
        System.out.println("音乐1");
        System.out.println("音乐2");
        System.out.println();
    }

    // 定义静态方法：打印歌曲的桥段部分
    public static void bridge() {
        System.out.println("桥段1");
        System.out.println("桥段2");
        System.out.println();
    }

    public static void main(String[] args) {
        // 调用方法组合成完整歌曲
        chorus();       // 第一次调用副歌
        music();        // 调用音乐
        bridge();       // 调用桥段
        chorus();       // 第二次调用副歌（复用代码）

        // 创建对象（实例化）
        Song mySong = new Song("歌曲1");
        // 通过对象调用实例方法
        mySong.printTitle();   // 调用打印标题的实例方法
        mySong.singChorus();   // 调用演唱副歌的实例方法

        // 再创建一个对象，调用相同方法（行为相同，数据不同）
        Song yourSong = new Song("歌曲2");
        yourSong.printTitle();
        yourSong.singChorus();

    }
}

class Song {
    // 实例变量：存储歌曲名称
    private String title;

    // 构造方法：初始化歌曲名称
    public Song(String title) {
        this.title = title;
    }

    // 实例方法：打印歌曲标题
    public void printTitle() {
        System.out.println("歌曲名称：" + title);
    }

    // 实例方法：演唱副歌（使用实例变量）
    public void singChorus() {
        System.out.println(title + "：进行副歌演唱");
    }

}
