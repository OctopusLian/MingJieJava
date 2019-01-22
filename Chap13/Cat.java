//--- 猫类 ---//
public class Cat extends Animal {
	private int age;				// 年龄

	public Cat(String name, int age) { super(name);  this.age = age; }

	public void bark() { System.out.println("喵!!"); }

	public String toString() { return age + "岁的" + getName(); }
}
