package Assigments.Module2;

import java.util.Scanner;

/**
 * @Author mensh
 * @Date 2025/7/21 13:48
 * @Abstract
 */

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder textBuilder = new StringBuilder(); // 累积输入文本
        int lineCount = 0; // 统计行数

        System.out.println("Enter text (type 'END' on a new line to finish):");

        // 读取输入，直到用户输入"END"
        while (true) {
            String line = scanner.nextLine(); // 读取一行输入
            if (line.equals("END")) { // 检查是否结束
                break;
            }
            textBuilder.append(line).append("\n"); // 拼接当前行并添加换行符
            lineCount++; // 行数+1（当前行有效）
        }
        scanner.close();

        // 将累积的文本转为字符串
        String fullText = textBuilder.toString();

        // 1. 统计字符数（包括空格、换行符等）
        int charCount = fullText.length();

        // 2. 统计单词数（按一个或多个空格分割，过滤空字符串）
        String[] words = fullText.split("\\s+"); // \\s+ 匹配任意连续空格
        int wordCount = 0;
        for (String word : words) {
            // 排除空字符串（如文本开头/结尾的空格导致的空元素）
            if (!word.isEmpty()) {
                wordCount++;
            }
        }

        // 3. 统计句子数（遇到 .!? 且前一个字符不是标点时计数）
        int sentenceCount = 0;
        boolean lastWasPunctuation = false; // 标记上一个字符是否为标点
        for (int i = 0; i < fullText.length(); i++) {
            char c = fullText.charAt(i);
            // 检查当前字符是否为句子结束标点
            if (c == '.' || c == '!' || c == '?') {
                // 避免连续标点重复计数（如 "!!" 只算一个句子）
                if (!lastWasPunctuation) {
                    sentenceCount++;
                    lastWasPunctuation = true;
                }
            } else {
                // 非标点时重置标记
                lastWasPunctuation = false;
            }
        }

        // 4. 行数已在读取时统计（lineCount）

        // 输出统计结果
        System.out.println("\nText Analysis Results:");
        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);
        System.out.println("Sentences: " + sentenceCount);
    }

}
