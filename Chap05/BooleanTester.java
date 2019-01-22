// 显示关系运算符、相等运算符、逻辑非运算符的结果值

import java.util.Scanner;

class BooleanTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a："); int a = stdIn.nextInt();
		System.out.print("整数b："); int b = stdIn.nextInt();

		System.out.println("a <  b  = " + (a <  b));
		System.out.println("a <= b  = " + (a <= b));
		System.out.println("a >  b  = " + (a >  b));
		System.out.println("a >= b  = " + (a >= b));
		System.out.println("a == b  = " + (a == b));
		System.out.println("a != b  = " + (a != b));
		System.out.println("!(a==0) = " + !(a == 0));
		System.out.println("!(b==0) = " + !(b == 0));
	}
}
