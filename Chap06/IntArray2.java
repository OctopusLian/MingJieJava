﻿// 将1, 2, 3, 4, 5赋给数组中的各元素并显示

class IntArray2 {

	public static void main(String[] args) {
		int[] a = new int[5];	// 数组的声明

		for (int i = 0; i < a.length; i++)
			a[i] = i + 1;

		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
