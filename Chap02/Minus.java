﻿// 读入整数值并显示对其符号进行取反后的值

import java.util.Scanner;

class Minus {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数值：");
		int a = stdIn.nextInt();	// 读入a的整数值

		int b = -a;						// 用对a的符号进行取反后的值来初始化b
		System.out.println(a + "的符号取反后的值是" + b + "。");
	}
}
