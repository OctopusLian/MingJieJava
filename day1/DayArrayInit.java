// 日期类Day【第1版】的数组（其３：初始化）

class DayArrayInit {

	public static void main(String[] args) {
		String[] wd = {"日", "一", "二", "三", "四", "五", "六"};

		// 明治、大正、昭和、平成的开始日期
		Day[] x = { new Day(1868,  9,  8),	    // 明治
					   new Day(1912,  7, 30),	// 大正
					   new Day(1926, 12, 25),	// 昭和
					   new Day(1989,  1,  8),	// 平成
					 };

		for (int i = 0; i < x.length; i++)
			System.out.println("x[" + i + "] = "
										+ x[i].getYear()  + "年"
										+ x[i].getMonth() + "月"
										+ x[i].getDate()  + "日("
										+ wd[x[i].dayOfWeek()] + ")");
	}
}
