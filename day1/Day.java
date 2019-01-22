// 日期类Day【第1版】

class Day {
	private int year;			// 年
	private int month;			// 月
	private int date;			// 日

	//--- 构造函数 ---//
	Day(int year, int month, int date) {
		this.year  = year;		// 年	
		this.month = month;		// 月
		this.date  = date;		// 日
	}

	//--- 获取年、月、日 ---//
	int getYear()  { return year; }		// 获取年
	int getMonth() { return month; }	// 获取月
	int getDate()  { return date; }		// 获取日

	//--- 设置年、月、日 ---//
	void setYear(int year)   { this.year  = year; }		// 设置年
	void setMonth(int month) { this.month = month; }	// 设置月
	void setDate(int date)   { this.date  = date; }		// 设置日

	void set(int year, int month, int date) {			// 设置年月日
		this.year  = year;			// 年	
		this.month = month;			// 月
		this.date  = date;			// 日
	}

	//--- 计算星期 --//
	int dayOfWeek() {
		int y = year;					// 0 … 星期日
		int m = month;					// 1 … 星期一
		if (m == 1 || m == 2) {			//　 ：
			y--;						// 5 … 星期五
			m += 12;					// 6 … 星期六
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
}
