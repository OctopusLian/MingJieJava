// 判断读入的整数值的位数（0／１位／２位以上）

import java.util.Scanner;

class DigitsNo1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数值：");
		int n = stdIn.nextInt();

		if (n == 0)									// 0
			System.out.println("是0。");
		else if (n >= -9 && n <= 9)					// １位
			System.out.println("是1位数值。");
		else										// ２位以上
			System.out.println("是2位以上的数值。");
	}
}
