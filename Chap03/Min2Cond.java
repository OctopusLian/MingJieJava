// 显示读入的两个整数值中较小的值（其２：条件运算符）

import java.util.Scanner;

class Min2Cond {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");  int a = stdIn.nextInt();
		System.out.print("整数b：");  int b = stdIn.nextInt();

		int min = a < b ? a : b;		// 较小的值
		System.out.println("较小的值是" + min + "。");
	}
}
