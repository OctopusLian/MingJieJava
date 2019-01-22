// 显示读入的月份所处的季节

import java.util.Scanner;

class Season {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("计算季节。\n请输入月份：");
		int month = stdIn.nextInt();

		if (month >= 3 && month <= 5)						// 3月·4月·5月
			System.out.println("这是春天。");
		else if (month >= 6 && month <= 8)					// 6月·7月·8月
			System.out.println("这是夏天。");
		else if (month >= 9 && month <= 11)					// 9月·10月·11月
			System.out.println("这是秋天。");
		else if (month == 12 || month == 1 || month == 2)	// 12月·1月·2月
			System.out.println("这是冬天。");
	}
}
