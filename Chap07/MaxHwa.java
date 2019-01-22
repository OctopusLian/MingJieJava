// 计算3个人的身高、体重、年龄的最大值并显示结果

import java.util.Scanner;

class MaxHwa {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int[] height = new int[3];		// 身高
		int[] weight = new int[3];		// 体重
		int[] age    = new int[3];		// 年龄

		for (int i = 0; i < 3; i++) {	// 读入
			System.out.print("[" + (i + 1) + "] ");
			System.out.print("身高：");		height[i] = stdIn.nextInt();
			System.out.print("    体重：");	weight[i] = stdIn.nextInt();
			System.out.print("    年龄：");	age[i]    = stdIn.nextInt();
		}

		// 计算身高的最大值
		int maxHeight = height[0];
		if (height[1] > maxHeight) maxHeight = height[1];
		if (height[2] > maxHeight) maxHeight = height[2];

		// 计算体重的最大值
		int maxWeight = weight[0];
		if (weight[1] > maxWeight) maxWeight = weight[1];
		if (weight[2] > maxWeight) maxWeight = weight[2];

		// 计算年龄的最大值
		int maxAge = age[0];
		if (age[1] > maxAge) maxAge = age[1];
		if (age[2] > maxAge) maxAge = age[2];

		System.out.println("身高的最大值为" + maxHeight + "。");
		System.out.println("体重的最大值为" + maxWeight + "。");
		System.out.println("年龄的最大值为" + maxAge    + "。");
	}
}
