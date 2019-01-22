﻿// 计算int型整数中值为1的位数

import java.util.Scanner;

class CountBitsC2 {

	//--- 显示int型的位构成 ---//
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

	//--- 计算int型整数x中值为1的位数 ---//
	static int countBits(int x) {
		int bits = (x >> 1) & 03333333333;
		bits = x - bits - ((bits >> 1) & 03333333333);
		bits = ((bits + (bits >> 3)) & 0707070707) % 077;
		return bits;
	}


	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数：");
		int x = stdIn.nextInt();

		System.out.print("位构成 = ");  printBits(x);
		System.out.println("\n值为1的位数 = " + countBits(x));
	}
}