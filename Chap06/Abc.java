import java.util.Scanner;

class Abc {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 将全部元素初始化为默认值0
		int[] a = new int[5];

		// 显式初始化
		int[] b = {1, 2, 3, 4, 5};

		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);

		for (int i = 0; i < b.length; i++)
			System.out.println("b[" + i + "] = " + b[i]);

		// 数组a的全部元素中读入数值

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}

		// 计算数组a中全部元素的总和
		int sum = 0;

		for (int i : a)
			sum += i;

		System.out.println("a的总和 = " + sum);

		// ２行４列的二维数组

		int[][] c = new int[2][4];

		System.out.println("数组c");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++)
				System.out.printf("%3d", c[i][j]);
			System.out.println();
		}

		// 每行的列数不同的二维数组
		int[][] d = {
			new int[5], new int[3], new int[4]
		};

		System.out.println("数组d");
		for (int i = 0; i < d.length; i++) {
			int j = 0;
			for ( ; j < d[i].length; j++)
				System.out.printf("%3d", d[i][j]);
			for ( ; j < 5; j++)
				System.out.print("  -");
			System.out.println();
		}
	}
}
