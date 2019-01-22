// 计算int型整数中值为1的位数

import java.util.Scanner;

class CountBitsC3 {

	//--- 显示int型的位构成 ---//
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

	//--- 计算int型整数x中值为1的位数 ---//
	static int countBits(int x) {
		x = (x & 0x55555555) + (x >> 1 & 0x55555555);
		x = (x & 0x33333333) + (x >> 2 & 0x33333333);
		x = (x & 0x0f0f0f0f) + (x >> 4 & 0x0f0f0f0f);
		x = (x & 0x00ff00ff) + (x >> 8 & 0x00ff00ff);
		return (x & 0x0000ffff) + (x >> 16 & 0x0000ffff);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数：");
		int x = stdIn.nextInt();

		System.out.print("位构成 = ");  printBits(x);
		System.out.println("\n值为1的位数 = " + countBits(x));
	}
}