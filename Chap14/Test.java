//--- 测试 ---//
public class Test {

	public static void main(String[] args) {
		Wearable[] w = {
			new WearableComputer("HAL"),	// 计算机
			new WearableRobot(Color.RED),	// 机器人
			new WearableRobot(Color.GREEN),	// 机器人
		};

		for (Wearable k : w) {
			k.putOn();
			k.putOff();
			System.out.println();
		}
	}
}
