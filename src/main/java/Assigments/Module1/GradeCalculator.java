package Assigments.Module1;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // 创建Scanner对象用于获取用户输入
        Scanner in = new Scanner(System.in);

        // 1. 获取用户输入的学生信息和各项成绩
        System.out.print("Enter student name: ");
        String name = in.nextLine();  // 读取学生姓名（支持空格）

        System.out.print("Enter average assignment grade (0-100): ");
        double averageAssignmentGrade = in.nextDouble();  // 作业平均成绩

        System.out.print("Enter number of studios attended (0-8): ");
        int studiosAttended = in.nextInt();  // 参加的工作室次数

        System.out.print("Enter average quiz grade (0-100): ");
        double averageQuizGrade = in.nextDouble();  // 测验平均成绩（已-drop最低分）

        System.out.print("Enter average exam grade (0-100): ");
        double averageExamGrade = in.nextDouble();  // 考试平均成绩

        // 2. 计算各项加权成绩（四舍五入到两位小数）
        // 作业权重：30%
        double weightedAssignment = averageAssignmentGrade * 0.3;
        weightedAssignment = Math.round(weightedAssignment * 100) / 100.0;

        // 工作室权重：10%（总8次，按出席比例计算）
        double weightedStudio = (studiosAttended / 8.0) * 10;
        weightedStudio = Math.round(weightedStudio * 100) / 100.0;

        // 测验权重：2%
        double weightedQuiz = averageQuizGrade * 0.02;
        weightedQuiz = Math.round(weightedQuiz * 100) / 100.0;

        // 考试权重：58%（总和确保为100%：30%+10%+2%+58%）
        double weightedExam = averageExamGrade * 0.58;
        weightedExam = Math.round(weightedExam * 100) / 100.0;

        // 3. 计算总分数（保留两位小数）
        double totalGrade = weightedAssignment + weightedStudio + weightedQuiz + weightedExam;
        totalGrade = Math.round(totalGrade * 100) / 100.0;

        // 4. 按格式输出结果
        System.out.println("\nCSE131 Grade for: " + name);
        System.out.println("Average assignment grade: " + averageAssignmentGrade);
        System.out.println("Weighted assignment grade (out of 30): " + weightedAssignment + "%");
        System.out.println("Number of studios attended: " + studiosAttended);
        System.out.println("Weighted studio grade (out of 10): " + weightedStudio + "%");
        System.out.println("Average quiz grade: " + averageQuizGrade);
        System.out.println("Weighted quiz grade (out of 2): " + weightedQuiz + "%");
        System.out.println("Average exam grade: " + averageExamGrade);
        System.out.println("Weighted exam grade (out of 58): " + weightedExam + "%");
        System.out.println("Total Grade: " + totalGrade + "%");

        // 关闭Scanner
        in.close();
    }
}
