// 标识编号类（其２：通过随机数来设定开始编号）

import java.util.Random;

class RandId {
	private static int counter;	// 赋到了哪一个标识编号

	private int id;				// 标识编号

	static {
		Random rand = new Random();
		counter = rand.nextInt(10) * 100;
	}

	//-- 构造函数 --//
	public RandId() {
		id = ++counter;			// 标识编号
	}

	//--- 获取标识编号 ---//
	public int getId() {
		return id;
	}
}

public class RandIdTester {

	public static void main(String[] args) {
		RandId a = new RandId();
		RandId b = new RandId();
		RandId c = new RandId();

		System.out.println("a的标识编号：" + a.getId());
		System.out.println("b的标识编号：" + b.getId());
		System.out.println("c的标识编号：" + c.getId());
	}
}