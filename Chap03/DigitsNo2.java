﻿// 判断读入的整数值的位数（是否是2位以上）

import java.util.Scanner;

class DigitsNo2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数值：");
		int n = stdIn.nextInt();

		if (n <= -10 || n >= 10)						// ２位以上
			System.out.println("是2位以上的数值。");
		else											// 不足２位
			System.out.println("是不足2位的数值。");
	}
}
