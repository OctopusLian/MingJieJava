// 复制并显示数组中的全部元素

import java.util.Scanner;

class CopyArray {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("元素个数：");
		int n = stdIn.nextInt();		// 读入元素个数
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {	// 数组a中读入数值
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}

		for (int i = 0; i < n; i++)		// 将数组a中的全部元素复制到b中
			b[i] = a[i];

		System.out.println("已经将a中的全部元素复制到了b中。 ");

		for (int i = 0; i < n; i++)		// 显示数组b
			System.out.println("b[" + i + "] = " + b[i]);
	}
}
