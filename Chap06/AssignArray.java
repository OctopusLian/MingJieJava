// 数组的赋值（错误）

class AssignArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {6, 5, 4, 3, 2, 1, 0};

		System.out.print("a = ");			// 显示数组a中的全部元素
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		System.out.print("b = ");			// 显示数组b中的全部元素
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();
	
		b = a;					// 将数组a复制到b（？）

		a[0] = 10;				// 改写数组a[0]的值

		System.out.println("将a赋给了b。 ");
		System.out.print("a = ");			// 显示数组a中的全部元素
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		System.out.print("b = ");			// 显示数组b中的全部元素
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();
	}
}
