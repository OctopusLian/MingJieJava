// 图形类群【第1版】的使用示例

class ShapeTester {

	public static void main(String[] args) {
// 	下述声明错误：抽象类无法实例化
//		Shape s = new Shape();

		Shape[] a = new Shape[2];
		a[0] = new Point();			// 点
		a[1] = new Rectangle(4, 3);	// 长方形

		for (Shape s : a) {
			s.draw();		// 绘图
			System.out.println();
		}
	}
}
