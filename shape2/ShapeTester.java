// 图形类群【第2版】的使用示例

class ShapeTester {

	public static void main(String[] args) {
		Shape[] p = new Shape[4];

		p[0] = new Point();			 // 点
		p[1] = new HorzLine(5);		 // 横线
		p[2] = new VertLine(3);		 // 竖线
		p[3] = new Rectangle(4, 3);	 // 长方形

		for (Shape s : p) {
			s.print();
			System.out.println();
		}
	}
}
