/**
 * 类VertLine是表示竖线的类。
 * 该类派生自表示直线的抽象类AbstLine。
 * @author	柴田望洋
 * @see		Shape
 * @see		AbstLine
*/
public class VertLine extends AbstLine {

	/**
	 * 创建竖线的构造函数。
	 * 接收长度参数。
     * @param length 创建的直线长度。
	*/
	public VertLine(int length) { super(length); }

	/**
	 * 方法toString返回表示与竖线相关的图形信息的字符串。
	 * @return 返回字符串"VertLine(length:3)"。
	 *			3的部分是长度所对应的值。
	*/
	public String toString() {
		return "VertLine(length:" + getLength()  + ")"; 
	}

	/**
	 * 方法draw用于绘制竖线。
     * 通过纵向排列竖线'|'进行绘图。
	 * 循环显示长度个数的'|'及换行。
	*/
	public void draw() {
		for (int i = 1; i <= getLength() ; i++)
			System.out.println('|'); 
	}
}
