// is-A关系和实例的引用（其１）

class TimeAccountTester1 {

	public static void main(String[] args) {
		Account adachi = new Account("足立幸一", "123456", 1000);
		TimeAccount nakata = new TimeAccount("仲田真二", "654321", 200, 500);

		Account x;		// 类类型变量 …
		x = adachi;			// 可以引用自身类型的实例（这是当然的） 
		x = nakata;			// 也可以引用下位类类型的实例！

		System.out.println("x的可用余额：" + x.getBalance());

		TimeAccount y;	// 类类型变量 …
//		y = adachi;			// 不可以引用上位类类型的实例！
		y = nakata;			// 可以引用自身类型的实例（这是当然的）

		System.out.println("y的可用余额：" + y.getBalance());
		System.out.println("y的定期存款：" + y.getTimeBalance());
	}
}
