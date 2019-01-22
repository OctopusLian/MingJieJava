// 计算int型整数中值为1的位数

import java.util.Scanner;

class CountBits {

	//--- 显示int型的位构成 ---//
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

	//--- 计算int型整数x中值为1的位数 ---//
	static int countBits(int x) {
		int bits = 0;
		while (x != 0) {
			if ((x & 1) == 1) bits++;	// 最低位是否为1？
			x >>>= 1;					// 移出已经确认完毕的最低位
		}
		return bits;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数：");
		int x = stdIn.nextInt();

		System.out.print("位构成 = ");
		printBits(x);
		System.out.println("\n值为1的位数 = " + countBits(x));
	}
}
