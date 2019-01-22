// 计算两个整数值中较小的值和较大的值

import java.util.Scanner;

class MinMax {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");  int a = stdIn.nextInt();
		System.out.print("整数b：");  int b = stdIn.nextInt();

		int min, max;		// 较小的值／较大的值

		if (a < b) {		// 如果a小于b
			min = a;
			max = b;
		} else {				// 否则
			min = b;
			max = a;
		}

		System.out.println("较小的值是" + min + "。");
		System.out.println("较大的值是" + max + "。");
	}
}
