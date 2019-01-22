// 将两个变量按升序（从小到大的顺序）进行排序

import java.util.Scanner;

class Sort2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("变量a：");
		int a = stdIn.nextInt();

		System.out.print("变量b：");
		int b = stdIn.nextInt();

		if (a > b) {	// 如果a大于b
			int t = a;	// 交换它们的值
			a = b;
			b = t;
		}

		System.out.println("排序成a≦b。");
		System.out.println("变量a是" + a + "。");
		System.out.println("变量b是" + b + "。");
	}
}
