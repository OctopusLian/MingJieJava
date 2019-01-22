// 日期类Day【第4版】的使用示例

import java.util.Scanner;

class DayTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int y, m, d;

		System.out.print("公历年份：");
		y = stdIn.nextInt();
		System.out.println("该年" + 
							(Day.isLeap(y) ? "是闰年。" : "不是闰年。"));

		System.out.println("请输入日期。");
		System.out.print("年：");  y = stdIn.nextInt();
		System.out.print("月：");  m = stdIn.nextInt();
		System.out.print("日：");  d = stdIn.nextInt();
		Day a = new Day(y, m, d);	// 读入的日期
		System.out.println(a.getYear() + "年" + 
							(a.isLeap() ? "是闰年。" : "不是闰年。"));
	}
}
