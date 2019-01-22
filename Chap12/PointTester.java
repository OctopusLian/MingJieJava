// 二维坐标类和三维坐标类

// 二维坐标类
class Point2D {
	int x;	// Ｘ坐标
	int y;	// Ｙ坐标

	Point2D(int x, int y) { this.x = x; this.y = y; }

	void setX(int x) { this.x = x; }		// 设置Ｘ坐标
	void setY(int y) { this.y = y; }		// 设置Ｙ坐标

	int getX() { return x; }				// 获取Ｘ坐标
	int getY() { return y; }				// 获取Ｙ坐标
}

// 三维坐标类
class Point3D extends Point2D {
	int z;	// Ｚ坐标

	Point3D(int x, int y, int z) { super(x, y); this.z = z; }

	void setZ(int z) { this.z = z; }		// 设置Ｚ坐标
	int getZ() { return z; }				// 获取Ｚ坐标
}

public class PointTester {

	public static void main(String[] args) {

		Point2D a = new Point2D(10, 15);
		Point3D b = new Point3D(20, 30, 40);

		System.out.printf("a = (%d, %d)\n",     a.getX(), a.getY());
		System.out.printf("b = (%d, %d, %d)\n", b.getX(), b.getY(), b.getZ());
	}
}
