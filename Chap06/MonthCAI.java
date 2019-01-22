// 学习表示月份的英语单词的程序

import java.util.Random;
import java.util.Scanner;

class MonthCAI {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = {
			"January", "February", "March", "April", "May", "June", "July",
			"August", "September", "October", "November", "December"
		};

		int month = rand.nextInt(12);	// 目标月份：0～11的随机数
		System.out.println("题目是" + monthString[month]);

		while (true) {
			System.out.print("是几月呢：");
			int m = stdIn.nextInt();

			if (m == month + 1) break;
			System.out.println("回答错误。");
		}
		System.out.println("回答正确。");
	}
}
