// 不规则二维数组

class UnevennessArray {

	public static void main(String[] args) {
		int[][] c;
		c = new int[3][];
		c[0] = new int[5];
		c[1] = new int[3];
		c[2] = new int[4];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++)
				System.out.printf("%3d", c[i][j]);
			System.out.println();
		}
	}
}
