// 汽车类【第2版】

public class Car {
	private String name;		// 名称
	private int width;			// 宽度
	private int height;			// 高度
	private int length;			// 长度
	private double x;			// 当前位置的Ｘ坐标
	private double y;			// 当前位置的Ｙ坐标
	private double fuel;		// 剩余燃料
	private Day purchaseDay;	// 购买日期

	//--- 构造函数 ---//
	public Car(String name, int width, int height, int length, double fuel,
				  Day purchaseDay) {
		this.name = name;  		this.width = width;	this.height = height;
		this.length = length;	this.fuel = fuel;		x = y = 0.0;
		this.purchaseDay = new Day(purchaseDay); 
	}

	public double getX() { return x; }			// 获取当前位置的Ｘ坐标
	public double getY() { return y; }			// 获取当前位置的Ｙ坐标
	public double getFuel() { return fuel; }	// 获取剩余燃料
	public Day getPurchaseDay() {				// 获取购买日期
		return new Day(purchaseDay);
	}

	//--- 显示型号 ---//
	public void putSpec() {
		System.out.println("名称：" + name);
		System.out.println("车宽：" + width  + "mm");
		System.out.println("车高：" + height + "mm");
		System.out.println("车长：" + length + "mm");
	}

	//--- 向Ｘ方向移动dx、向Ｙ方向移动dy ---//
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);		// 移动距离

		if (dist > fuel)
			return false;				// 无法移动　… 燃料不足
		else {
			fuel -= dist;				// 减掉移动距离所消耗的燃料
			x += dx;
			y += dy;
			return true;				// 移动结束
		}
	}
}
