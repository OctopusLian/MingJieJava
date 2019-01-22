/**
 * 类Point是表示点的类。
 * 该类派生自表示图形的抽象类Shape。
 * 无字段。
 * @author	柴田望洋
 * @see		Shape
*/
public class Point extends Shape {

	/**
	 * 创建点的构造函数。
	 * 不接收参数。
	*/
	public Point() {
		// 无操作
	}

	/**
	 * 方法toString返回表示与点相关的图形信息的字符串。
     * 返回的字符串总是"Point"。
	 * @return 返回字符串"Point"。
	*/
	public String toString() {
		return "Point"; 
	}

	/**
	 * 方法draw用于绘制点。
	 * 只显示一个加号'+'，并换行。
	*/
	public void draw() {
		System.out.println('+'); 
	}
}
