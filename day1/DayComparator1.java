﻿// 日期类Day【第1版】的使用示例（其３：比较两个日期①）

import java.util.Scanner;

class DayComparator1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int y, m, d;
		System.out.println("请输入日期1。");
		System.out.print("年：");  y = stdIn.nextInt();
		System.out.print("月：");  m = stdIn.nextInt();
		System.out.print("日：");  d = stdIn.nextInt();
		Day day1 = new Day(y, m, d);

		System.out.println("请输入日期2。");
		System.out.print("年：");  y = stdIn.nextInt();
		System.out.print("月：");  m = stdIn.nextInt();
		System.out.print("日：");  d = stdIn.nextInt();
		Day day2 = new Day(y, m, d);

		if (day1 == day2)
			System.out.println("相等。");
		else
			System.out.println("不相等。");
	}
}
