// 日期类Day【第1版】的使用示例（其１：显示日期）

import java.util.Scanner;

class DayTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] wd = {"日", "一", "二", "三", "四", "五", "六"};

		System.out.println("请输入阳历生日。");
		System.out.print("年：");  int y = stdIn.nextInt();
		System.out.print("月：");  int m = stdIn.nextInt();
		System.out.print("日：");  int d = stdIn.nextInt();

		Day birthday = new Day(y, m, d);

		System.out.println("你的生日"
								 + birthday.getYear()  + "年"
								 + birthday.getMonth() + "月"
								 + birthday.getDate()  + "日是星期"
								 + wd[birthday.dayOfWeek()] + "。");
	}
}
