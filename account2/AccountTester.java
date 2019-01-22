// 银行账户类【第2版】和对其进行测试的类

// 银行账户类【第2版】
class Account {
	private String name;		// 账户名
	private String no;			// 账号
	private long balance;		// 可用余额

	//--- 构造函数 ---//
	Account(String n, String num, long z) {
		name = n;				// 账户名
		no = num;				// 账号
		balance = z;			// 可用余额
	}

	//--- 确认账户名 ---//
	String getName() {
		return name;
	}

	//--- 确认账号 ---//
	String getNo() {
		return no;
	}

	//--- 确认可用余额 ---//
	long getBalance() {
		return balance;
	}

	//--- 存入k日元 ---//
	void deposit(long k) {
		balance += k;
	}

	//--- 取出k日元 ---//
	void withdraw(long k) {
		balance -= k;
	}
}

// 用于测试银行账户类【第2版】的类
class AccountTester {

	public static void main(String[] args) {
		// 足立的账户
		Account adachi = new Account("足立幸一", "123456", 1000);
		// 仲田的账户
		Account nakata = new Account("仲田真二", "654321",  200);	

		adachi.withdraw(200);					// 足立取了200日元
		nakata.deposit(100);					// 仲田存了100日元

		System.out.println("■足立的账户");
		System.out.println(" 账户名：" + adachi.getName());
		System.out.println(" 账号：" + adachi.getNo());
		System.out.println(" 可用余额：" + adachi.getBalance());

		System.out.println("■仲田的账户");
		System.out.println(" 账户名：" + nakata.getName());
		System.out.println(" 账号：" + nakata.getNo());
		System.out.println(" 可用余额：" + nakata.getBalance());
	}
}
