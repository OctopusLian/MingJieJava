// 对读入的整数进行加法运算（输入0的话就结束）

import java.util.Scanner;

class SumBreak1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("对整数进行加法运算。");
		System.out.print("要相加多少个整数：");
		int n = stdIn.nextInt();	// 要相加的个数

		int sum = 0;	// 合计值
		for (int i = 0; i < n; i++) {
			System.out.print("整数（以0结束）：");
			int t = stdIn.nextInt();
			if (t == 0) break;		// 跳出for语句
			sum += t;
		}
		System.out.println("合计值为" + sum + "。");
	}
}
