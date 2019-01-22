// 标识编号类RandId的使用示例

import id.RandId;

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
