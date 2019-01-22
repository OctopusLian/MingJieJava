// 对读入的整数组进行加法运算（5个整数×10组）

import java.util.Scanner;

class SumGroup1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("对整数进行加法运算。");
		int total = 0;		// 所有组的合计值

	Outer:
		for (int i = 1; i <= 10; i++) {
			System.out.println("■第" + i + "组");
			int sum = 0;	// 每组的小计值
		Inner:
			for (int j = 0; j < 5; j++) {
				System.out.print("整数：");
				int t = stdIn.nextInt();
				if (t == 99999)
					break Outer;
				else if (t == 88888)
					break Inner;
				sum += t;
			}
			System.out.println("小计值为" + sum + "。\n");
			total += sum;
		}
		System.out.println("\n合计值为" + total + "。");
	}
}
