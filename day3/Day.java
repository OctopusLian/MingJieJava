// 日期类Day【第3版】

public class Day {
	private int	year	= 1;	// 年
	private int	month = 1;		// 月
	private int	date 	= 1;	// 日

	//-- 构造函数 --//
	public Day()                              { }
	public Day(int year)                      { this.year = year; }
	public Day(int year, int month)           { this(year); this.month = month; }
	public Day(int year, int month, int date) { this(year, month); this.date = date; }
	public Day(Day d)                         { this(d.year, d.month, d.date); }

	//--- 获取年、月、日 ---//
	public int getYear()  { return year; }	// 获取年
	public int getMonth() { return month; }	// 获取月
	public int getDate()  { return date; }	// 获取日

	//--- 设置年、月、日 ---//
	public void setYear(int year)   { this.year  = year; }	// 设置年
	public void setMonth(int month) { this.month = month; }	// 设置月
	public void setDate(int date)   { this.date  = date; }	// 设置日

	public void set(int year, int month, int date) {		// 设置年月日
		this.year  = year;			// 年	
		this.month = month;			// 月
		this.date  = date;			// 日
	}

	//--- 计算星期 ---//
	public int dayOfWeek() {
		int y = year;				// 0 … 星期日
		int m = month;				// 1 … 星期一
		if (m == 1 || m == 2) {		//　 ：
			y--;					// 5 … 星期五
			m += 12;				// 6 … 星期六
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	//--- 与日期d相等吗 ---//
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	//--- 返回字符串表示---//
	public String toString() {
		String[] wd = {"日", "一", "二", "三", "四", "五", "六"};
		return String.format("%04d年%02d月%02d日(%s)", 
								year, month, date, wd[dayOfWeek()]);
	}
}
