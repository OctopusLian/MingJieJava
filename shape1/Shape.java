// 图形类群【第1版】

//===== 图形 =====//
abstract class Shape {
	abstract void draw();			// 绘图（抽象方法）
}

//===== 点 =====//
class Point extends Shape {
	Point() { }						// 构造函数

	void draw() {					// 绘图
		System.out.println('+'); 
	}
}

//===== 长方形 =====//
class Rectangle extends Shape {
	private int width;		// 长
	private int height;		// 宽

	Rectangle(int width, int height) {	// 构造函数
		this.width = width;
		this.height = height;
	}

	void draw() {						// 绘图
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++)
				System.out.print('*'); 
			System.out.println(); 
		}
	}
}
