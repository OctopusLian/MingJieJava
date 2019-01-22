//--- 测试会员类 ---//
public class MemberTester {

	public static void main(String[] args) {
		Member[] m = {
			new Member("桥口", 101, 27),
			new SpecialMember("黑木", 102, 31, "会费免费"),
			new SpecialMember("松野", 103, 52, "会费减免一半"),
		};

		for (Member k : m) {
			k.print();
			System.out.println();
		}
	}
}
