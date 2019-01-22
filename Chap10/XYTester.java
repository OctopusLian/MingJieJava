// 带标识编号的ＸＹ类

class XY {
	private static int counter = 0;	// 赋到了哪一个标识编号
	private int id;					// 标识编号

	private int x = 0;	// Ｘ
	private int y = 0;	// Ｙ

	{
		id = ++counter;
	}
	
	public XY()             { }
	public XY(int x)        { this.x = x; }
	public XY(int x, int y) { this.x = x; this.y = y; }

	public String toString() {
		return "No." + id + " … (" + x  + ", " + y + ")";
	}
}

public class XYTester {

	public static void main(String[] args) {
		XY a = new XY();			// 初始化为( 0,  0)
		XY b = new XY(10);			// 初始化为(10,  0)
		XY c = new XY(20, 30);		// 初始化为(20, 30)

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
