// 从某一正整数值倒数到0（其２）

import java.util.Scanner;

class CountDown2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("倒数。");
		int x;
		do {
			System.out.print("正整数值：");
			x = stdIn.nextInt();
		} while (x <= 0);

		while (x >= 0)
			System.out.println(x--);	// 显示x的值并递减
	}
}
