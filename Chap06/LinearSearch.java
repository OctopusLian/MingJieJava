// 线性查找

import java.util.Random;
import java.util.Scanner;

class LinearSearch {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		final int n = 12;			// 元素个数
		int[] a = new int[n];		// 声明数组

		for (int j = 0; j < n; j++)
			a[j] = rand.nextInt(10);

		System.out.print("数组a中全部元素的值\n{ ");
		for (int j = 0; j < n; j++)
			System.out.print(a[j] + " ");
		System.out.println(" }");

		System.out.print("要查找的数值：");
		int key = stdIn.nextInt();

		int i;
		for (i = 0; i < n; i++)
			if (a[i] == key)
				break;

		if (i < n)									// 查找成功
			System.out.println("该元素是a[" + i + "]。");
		else										// 查找失败
			System.out.println("该元素不存在。");			
	}
}
