//===== 平行四边形 =====//
public class Parallelogram extends Shape implements Plane2D {
	private int width;			// 底边长
	private int height;			// 宽

	public Parallelogram(int width, int height) {
		this.width = width;	this.height = height;
	}

	public String toString() {							// 字符串表示 
		return "Parallelogram(width:" + width + ", height:" + height + ")";
	}

	public void draw() {								// 绘图
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++) System.out.print(' '); 
			for (int j = 1; j <= width; j++) System.out.print('#'); 
			System.out.println(); 
		}
	}

	public int getArea() { return width * height; }		// ○计算面积
}
