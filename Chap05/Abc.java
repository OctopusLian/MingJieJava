import java.util.Scanner;

class Abc {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("15   / 2   = " + 15   / 2  );
		System.out.println("15.0 / 2.0 = " + 15.0 / 2.0);
		System.out.println("15.0 / 2   = " + 15.0 / 2  );
		System.out.println("15   / 2.0 = " + 15   / 2.0);

		System.out.print("变量x："); int x = stdIn.nextInt();
		System.out.print("变量y："); int y = stdIn.nextInt();

		boolean eq = (x == y);
		System.out.println("它们" +
								 (eq ? "相等。" : "不相等。"));

		System.out.println("平均值为" +
								 (double)(x + y) / 2 + "。");

		for (int i = 0; i <= 1000; i++)
			System.out.printf("x = %6.5f\n", (float)i / 1000);

		System.out.println("\"ABC\"为字符串常量。");

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print('\\');
			System.out.println();
		}
	}
}