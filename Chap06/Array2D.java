// 创建一个二维数组，其全部元素中赋入随机数

import java.util.Random;
import java.util.Scanner;

class Array2D {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("行数：");
		int h = stdIn.nextInt();		// 读入行数

		System.out.print("列数：");
		int w = stdIn.nextInt();		// 读入列数

		int[][] x = new int[h][w];

		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++) {
				x[i][j] = rand.nextInt(100);
				System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
			}
	}
}
