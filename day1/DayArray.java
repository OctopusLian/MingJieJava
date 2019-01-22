// 日期类Day【第1版】的数组（其２）

import java.util.Scanner;

class DayArray {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] wd = {"日", "一", "二", "三", "四", "五", "六"};

		System.out.print("日期个数：");
		int n = stdIn.nextInt();

		Day[] a = new Day[n];			// 元素个数为n的Day类型数组

		for (int i = 0; i < a.length; i++)
			a[i] = new Day(2017, 10, 15);

		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = "
									 + a[i].getYear()  + "年"
									 + a[i].getMonth() + "月"
									 + a[i].getDate()  + "日("
									 + wd[a[i].dayOfWeek()] + ")");
	}
}
