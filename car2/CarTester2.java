// 汽车类【第2版】的使用示例（其２）

class CarTester2 {

	public static void main(String[] args) {
		Car myCar = new Car("爱车", 1885, 1490, 5220, 90.0, new Day(2000, 11, 18));

		myCar.putSpec();
		System.out.println("购买日期：" + myCar.getPurchaseDay().toString());
	}
}
