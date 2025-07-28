package Assigments.Module2;

import java.util.Scanner;

/**
 * @Author mensh
 * @Date 2025/7/28 19:44
 * @Abstract
 */

public class GamblerRuin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

       int startAmount = 10;
       double winChance = 0.65;
       int winLimit = 20;

       int totalSimulations = 500;
       int ruinCount = 0;
       for(int i = 1; i<= totalSimulations; i++){
           int money = startAmount;
           while(money>0 && money<winLimit){
               if(Math.random()<=winChance){
                   money++;
               }else {
                   money--;
               }
           }
           if (money==0){
               ruinCount++;
               System.out.println("第 "+ i +" 次仿真结果为：Lose!");
           }else {
               System.out.println("第 "+ i +" 次仿真结果为：Win!");
           }
       }

       // 实际破产概率
       double simRuinRate = (double)ruinCount/totalSimulations;
       // 理论破产概率
       double a = (1-winChance)/winChance;
       double theoRuinRate;
       if(winChance == 0.5){
           theoRuinRate = 1 - (double)startAmount/winLimit;
       } else {
           theoRuinRate = Math.pow(a,startAmount)-Math.pow(a,winLimit) / (1 - Math.pow(a,winLimit));
       }

        System.out.printf("理论破产概率为: %.6f",theoRuinRate);
        System.out.println("仿真破产概率: "+ simRuinRate);
    }
}
