// 猜数字游戏（目标数字范围为0～99）

import java.util.Random;
import java.util.Scanner;

class Kazuate {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int no = rand.nextInt(100);	// 目标数字：生成一个0～99的随机数

		System.out.println("猜数字游戏开始!!");
		System.out.println("请猜一个0～99的数字。");

		int x;								// 玩家输入的数字
		do {
			System.out.print("是多少呢：");
			x = stdIn.nextInt();

			if (x > no)
				System.out.println("比这个数字小呦。");
			else if (x < no)
				System.out.println("比这个数字大呦。");
		} while (x != no);

		System.out.println("回答正确。");
	}
}
