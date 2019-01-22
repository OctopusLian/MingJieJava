// 日期类Day【第2版】的使用示例

import java.util.Scanner;

class DayTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("请输入day1。");
		System.out.print("年：");  int y = stdIn.nextInt();
		System.out.print("月：");  int m = stdIn.nextInt();
		System.out.print("日：");  int d = stdIn.nextInt();

		Day day1 = new Day(y, m, d);	// 读入日期
		System.out.println("day1 = " + day1);

		Day day2 = new Day(day1);		// 与day1相同的日期
		System.out.println("创建了与day1的日期相同的day2。");
		System.out.println("day2 = " + day2);

		if (day1.equalTo(day2))
			System.out.println("day1和day2相等。");
		else
			System.out.println("day1和day2不相等。");

		Day d1 = new Day();					//    1年 1月 1日
		Day d2 = new Day(2010);				// 2010年 1月 1日
		Day d3 = new Day(2010, 10);			// 2010年10月 1日
		Day d4 = new Day(2010, 10, 15);		// 2010年10月15日

		System.out.println("d1   = " + d1);
		System.out.println("d2   = " + d2);
		System.out.println("d3   = " + d3);
		System.out.println("d4   = " + d4);

		Day[] a = new Day[3];			// 元素个数为3的Day类型数组
		for (int i = 0; i < a.length; i++)
			a[i] = new Day();			// 将全部元素都设置为1年1月1日

		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
