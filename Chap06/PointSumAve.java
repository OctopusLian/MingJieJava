// 读入分数并显示总分和平均分

import java.util.Scanner;

class PointSumAve {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int sum = 0;		// 总分
		System.out.println("请输入5名学生的分数。");

		System.out.print("1号的分数：");
		int yamane = stdIn.nextInt();
		sum += yamane;

		System.out.print("2号的分数：");
		int takada = stdIn.nextInt();
		sum += takada;

		System.out.print("3号的分数：");
		int kawachi = stdIn.nextInt();
		sum += kawachi;

		System.out.print("4号的分数：");
		int koga = stdIn.nextInt();
		sum += koga;

		System.out.print("5号的分数：");
		int tozuka = stdIn.nextInt();
		sum += tozuka;

		System.out.println("总分为" + sum + "分。");
		System.out.println("平均分为" + (double)sum / 5 + "分。");
	}
}
