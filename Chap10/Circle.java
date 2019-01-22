// 计算圆的周长和面积（使用圆周率Math.PI）

import java.util.Scanner;

class Circle {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("半径：");
		double r = stdIn.nextDouble();	// r中读入实数值

		System.out.println("周长是" + 2 * Math.PI * r + "。");
		System.out.println("面积是" + Math.PI * r * r + "。");
	}
}
