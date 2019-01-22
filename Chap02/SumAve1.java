// 显示变量x和y的合计值与平均值

class SumAve1 {

	public static void main(String[] args) {
		int x;			// x是int型变量
		int y;			// y是int型变量

		x = 63;			// 把63赋给x
		y = 18;			// 把18赋给y

		System.out.println("x的值是" + x + "。");			  // 显示x的值
		System.out.println("y的值是" + y + "。");			  // 显示y的值
		System.out.println("合计值是" + (x + y) + "。");	  // 显示合计值
		System.out.println("平均值是" + (x + y) / 2 + "。");  // 显示平均值
	}
}
