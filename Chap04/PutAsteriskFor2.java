// 显示读入的数值个*

import java.util.Scanner;

class PutAsteriskFor2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要显示多少个*呢：");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++)
			System.out.print('*');
		System.out.println();
	}
}
