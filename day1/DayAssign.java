// 日期类Day【第1版】的使用示例（其２：类类型变量的赋值）

import java.util.Scanner;

class DayAssign {

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

		Day xDay = birthday;

		xDay.set(2100, 12, 31);		// 设置为2100年12月31日

		System.out.println("birthday = "
								 + birthday.getYear()  + "年"
								 + birthday.getMonth() + "月"
								 + birthday.getDate()  + "日（"
								 + wd[birthday.dayOfWeek()] + "）");

		System.out.println("xDay     = "
								 + xDay.getYear()  + "年"
								 + xDay.getMonth() + "月"
								 + xDay.getDate()  + "日（"
								 + wd[xDay.dayOfWeek()] + "）");
	}
}
