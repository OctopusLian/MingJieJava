// 标识编号类（放入包中）

package id;

import java.util.Random;

public class RandId {

	private static int counter;	// 赋到了哪一个标识编号

	private int id;				// 标识编号

	static {
		Random rand = new Random();
		counter = rand.nextInt(10) * 100;		
	}

	//-- 构造函数 --//
	public RandId() {
		id = ++counter;			// 标识编号
	}

	//--- 获取标识编号 ---//
	public int getId() {
		return id;
	}
}
