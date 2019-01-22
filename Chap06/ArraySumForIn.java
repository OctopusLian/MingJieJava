// 计算并显示数组中全部元素的总和（扩展for语句）

class ArraySumForIn {

	public static void main(String[] args) {
		double[] a = { 1.0, 2.0, 3.0, 4.0, 5.0 };

		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);

		double sum = 0;	// 总和
		for (double i : a)
			sum += i;

		System.out.println("全部元素的总和为" + sum + "。");
	}
}
