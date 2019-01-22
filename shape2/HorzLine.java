/**
 * 类HorzLine是表示横线的类。
 * 该类派生自表示直线的抽象类AbstLine。
 * @author	柴田望洋
 * @see		Shape
 * @see		AbstLine
*/
public class HorzLine extends AbstLine {

	/**
	 * 创建横线的构造函数。
	 * 接收长度参数。
     * @param length 创建的直线长度。
	*/
	public HorzLine(int length) { super(length); }

	/**
	 * 方法toString返回表示与横线相关的图形信息的字符串。
	 * @return 返回字符串"HorzLine(length:3)"。
	 *			3的部分是长度所对应的值。
	*/
	public String toString() {
		return "HorzLine(length:" + getLength() + ")"; 
	}

	/**
	 * 方法draw用于绘制横线。
     * 通过横向排列减号'-'进行绘图。
	 * 连续显示长度个数的'-'，并换行。
	*/
	public void draw() {
		for (int i = 1; i <= getLength() ; i++)
			System.out.print('-'); 
		System.out.println(); 
	}
}
