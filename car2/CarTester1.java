// 汽车类【第2版】的使用示例（其１）

class CarTester1 {

	public static void main(String[] args) {
		Day d = new Day(2010, 10, 15);
		Car myCar = new Car("爱车", 1885, 1490, 5220, 90.0, d);

		Day p = myCar.getPurchaseDay();
		System.out.println("爱车的购买日期：" + p);

		p.set(1999, 12, 31);		// 改写购买日期（？）

		Day q = myCar.getPurchaseDay();
		System.out.println("爱车的购买日期：" + q);
	}
}
