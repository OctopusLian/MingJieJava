﻿// 计算两个整数值的实数平均值（用2.0来除合计值）

import java.util.Scanner;

class Average2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("计算整数值x和y的平均值。");
		System.out.print("x的值：");  int x = stdIn.nextInt();
		System.out.print("y的值：");  int y = stdIn.nextInt();

		double ave = (x + y) / 2.0;							// 平均值
		System.out.println("x和y的平均值为" + ave + "。");	// 显示
	}
}
