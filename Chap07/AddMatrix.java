// 计算两个矩阵的和

class AddMatrix {

	//--- 把x和y的和赋给z ---//
	static void addMatrix(int[][] x, int[][] y, int[][] z) {
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				z[i][j] = x[i][j] + y[i][j];
	}

	//--- 显示矩阵m中的全部元素 ---//
	static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + "  ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] a = { {1, 2, 3}, {4, 5, 6} };
		int[][] b = { {6, 3, 4}, {5, 1, 2} };
		int[][] c = new int[2][3];

		addMatrix(a, b, c);		// 将a和b的和赋给c

		System.out.println("矩阵a");	printMatrix(a);
		System.out.println("矩阵b");	printMatrix(b);
		System.out.println("矩阵c");	printMatrix(c);
	}
}
