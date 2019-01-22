// 如果读入的整数值为正值，则判断其为偶数还是奇数，并显示判断结果

import java.util.Scanner;

class EvenOdd {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数值：");
		int n = stdIn.nextInt();

		if (n > 0)
			if (n % 2 == 0)
				System.out.println("该值为偶数。");
			else
				System.out.println("该值为奇数。");
		else
			System.out.println("输入的不是正值。");
	}
}
