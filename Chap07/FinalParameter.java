// 确认final形参不可以赋值

class FinalParameter {
	//--- 计算三个形参值的和 ---//
	static int sumOf(final int x, final int y, final int z) {
	// x = 10;
		return x + y + z;
	}

	public static void main(String[] args) {
		System.out.println(sumOf(1, 2, 3));
	}
}
