//--- 会员类 ---//
public class Member {
	private String name;	// 姓名
	private int no;			// 会员编号
	private int age;		// 年龄

	public Member(String name, int no, int age) {
		this.name = name;  this.no = no;  this.age = age;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println("No." + no + "：" + name +
						   "（" + age + "岁）");
	}
}
