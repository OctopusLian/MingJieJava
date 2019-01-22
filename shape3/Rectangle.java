/**
 * 类Rectangle是表示长方形的类。
 * 该类派生自表示图形的抽象类Shape。
 * @author	柴田望洋
 * @see		Shape
*/
public class Rectangle extends Shape implements Plane2D {

	/**
	 *	表示长方形的长的int型字段。
	*/
	private int width;

	/**
	 *	表示长方形的宽的int型字段。
	*/
	private int height;

	/**
	 *	创建长方形的构造函数。
	 *	接收长和宽作为参数。
     * @param width  长方形的长。
     * @param height 长方形的宽。
	*/
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * 方法toString返回表示与长方形相关的图形信息的字符串。
	 * @return 返回字符串"Rectangle(width:4, height:3)"。
	 *			4和3这两部分分别对应长和宽的值。
	*/
	public String toString() {
		return "Rectangle(width:" + width + ", height:" + height + ")"; 
	}

	/**
	 * 方法draw用于绘制长方形。
     * 通过排列星号'*'进行绘图。
	 * 循环width次显示长度个数的'*'并换行。
	*/
	public void draw() {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++)
				System.out.print('*'); 
			System.out.println(); 
		}
	}

	public int getArea() { return width * height; }		// ○计算面积
}
