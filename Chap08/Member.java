//--- 会员类 ---//
class Member {
	private String name;	// 姓名
	private int no;			// 会员号
	private int age;		// 年龄

	Member(String name, int no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}

	void print() {
		System.out.println("No." + no + "：" + name +
								 "（" + age + "岁）");
	}
}
