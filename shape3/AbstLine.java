/**
 * 类AbstLine是表示直线的抽象类。
 * 该类派生自表示图形的抽象类Shape。
 * 由于为抽象类，因此无法创建该类的实例。
 * 具体的直线类从该类进行派生。
 * @author	柴田望洋
 * @see		Shape
 * @see		HorzLine VertLine
*/
public abstract class AbstLine extends Shape {

	/**
	 *	表示直线长度的int型字段。
	*/
	private int length;

	/**
	 *	创建直线的构造函数。
	 *	接收长度参数。
     * @param length 创建的直线长度。
	*/
	public AbstLine(int length) {
		setLength(length);
	}

	/**
	 * 获取直线的长度。
     * @return 直线的长度。
	*/
	public int getLength() {
		return length;
	}

	/**
	 * 设置直线的长度。
     * @param length 设置的直线长度。
	*/
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * 方法toString返回表示与直线相关的图形信息的字符串。
	 * @return 返回字符串"AbstLine(length:3)"。
	 *			3的部分是长度所对应的值。
	*/
	public String toString() {
		return "AbstLine(length:" + length + ")"; 
	}
}
