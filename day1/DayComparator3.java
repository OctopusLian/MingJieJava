// 日期类Day【第1版】的使用示例（其５：比较两个日期③）

import java.util.Scanner;

class DayComparator3 {

	//--- d1和d2的日期相等吗？ ---//
	static boolean compDay(Day d1, Day d2) {
		return d1.getYear()  == d2.getYear() &&
				 d1.getMonth() == d2.getMonth() &&
				 d1.getDate()  == d2.getDate();
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int y, m, d;
		System.out.println("请输入日期1。");
		System.out.print("年：");  y = stdIn.nextInt();
		System.out.print("月：");  m = stdIn.nextInt();
		System.out.print("日：");  d = stdIn.nextInt();
		Day day1 = new Day(y, m, d);

		System.out.println("请输入日期2。");
		System.out.print("年：");  y = stdIn.nextInt();
		System.out.print("月：");  m = stdIn.nextInt();
		System.out.print("日：");  d = stdIn.nextInt();
		Day day2 = new Day(y, m, d);

		if (compDay(day1, day2))
			System.out.println("相等。");
		else
			System.out.println("不相等。");
	}
}
