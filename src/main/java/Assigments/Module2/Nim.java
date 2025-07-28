package Assigments.Module2;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author mensh
 * @Date 2025/7/28 11:09
 * @Abstract
 */

public class Nim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 获取初始棍子数量（必须为正数）
        int sticks = 0;
        while (sticks <= 0) {
            System.out.print("Enter the initial number of sticks (must be positive): ");
            sticks = scanner.nextInt();
            if (sticks <= 0) {
                System.out.println("The number of sticks must be positive. Please try again.");
            }
        }

        int round = 0;
        boolean humanTurn = true; // 人类玩家先手

        // 游戏主循环
        while (sticks > 0) {
            int currentSticks = sticks; // 保存当前轮次开始的棍子数量

            if (humanTurn) {
                // 人类玩家回合
                int move = 0;
                boolean valid = false;

                // 验证人类输入（必须是1或2，且不超过剩余棍子数）
                while (!valid) {
                    System.out.print("How many sticks do you want to remove (1 or 2)? There are " + sticks + " sticks: ");
                    move = scanner.nextInt();

                    if (move == 1 || move == 2) {
                        if (move <= sticks) {
                            valid = true;
                        } else {
                            System.out.println("There are only " + sticks + " sticks left. You can't take " + move + ".");
                        }
                    } else {
                        System.out.println("You must remove 1 or 2 sticks.");
                    }
                }

                sticks -= move; // 更新棍子数量
                System.out.println("Round " + round + ": " + currentSticks + " at start human takes " + move + ", so " + sticks + " remain");

                // 检查人类是否获胜
                if (sticks == 0) {
                    System.out.println("The human wins!");
                    break;
                }
                humanTurn = false; // 切换到电脑回合
            } else {
                // 电脑玩家回合
                int move;
                if (sticks >= 2) {
                    move = random.nextInt(2) + 1; // 随机选择1或2
                } else {
                    move = 1; // 只剩1根时必须取1
                }

                sticks -= move; // 更新棍子数量
                System.out.println("Round " + round + ": " + currentSticks + " at start computer takes " + move + ", so " + sticks + " remain");

                // 检查电脑是否获胜
                if (sticks == 0) {
                    System.out.println("The computer wins!");
                    break;
                }
                humanTurn = true; // 切换到人类回合

                /*
                // 智能电脑玩家决策
                int move;
                // 必胜策略实现
                if (sticks % 3 == 0) {
                    // 当棍子是3的倍数时，随机选择1或2（无法保持优势）
                    move = (sticks > 2) ? random.nextInt(2) + 1 : 1;
                } else {
                    // 非3倍数时：取走余数使剩余棍子成为3的倍数
                    move = sticks % 3;
                }
                sticks -= move;
                System.out.println("Round " + round + ": " + currentSticks + " at start computer takes " + move + ", so " + sticks + " remain");

                if (sticks == 0) {
                    System.out.println("The computer wins!");
                    break;
                }
                humanTurn = true;*/
            }
            round++; // 更新轮次计数器
        }
        scanner.close(); // 关闭Scanner
    }


}
