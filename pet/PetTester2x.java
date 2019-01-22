// 宠物类的使用示例（使用方法的参数来验证多态）

class PetTester2x {

	// 让p引用的实例进行自我介绍
	static void intro(Pet p) {
		p.introduce();
	}

	public static void main(String[] args) {
		Pet[] a = {
			new Pet("Kurt", "艾一"),
			new RobotPet("R2D2", "卢克"),
			new Pet("迈克尔", "英男"),
		};

		for (int i = 0; i < a.length; i++) {
			intro(a[i]);			// 让p引用的实例进行自我介绍
			System.out.println();
		}
	}
}
