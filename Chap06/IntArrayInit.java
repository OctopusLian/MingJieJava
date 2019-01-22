// 将数组中的各个元素初始化为1, 2, 3, 4, 5，并进行显示

class IntArrayInit {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};

		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
