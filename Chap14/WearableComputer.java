//--- 可穿戴的计算机 类 ---//
public class WearableComputer implements Wearable {
	private String name;			// 名称

	public WearableComputer(String name) { this.name = name; }

	public void putOn()  { System.out.println(name + " ON!!"); }
	public void putOff() { System.out.println(name + " OFF!!"); }
}
