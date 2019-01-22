// instanceof运算符的使用示例

class PetInstanceOf {

	public static void main(String[] args) {
		Pet[] a = {
			new Pet("Kurt", "艾一"),
			new RobotPet("R2D2", "卢克"),
			new Pet("迈克尔", "英男"),
		};

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] ");
			if (a[i] instanceof RobotPet)		// 如果a[i]是机器人…
				((RobotPet)a[i]).work(0);		// 　做家务（打扫）
			else								// 否则…
				a[i].introduce();				// 　自我介绍
		}
	}
}
