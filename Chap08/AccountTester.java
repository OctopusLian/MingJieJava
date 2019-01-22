// 银行账户类【第1版】和对其进行测试的类

// 银行账户类【第1版】
class Account {
	String name;		// 账户名
	String no;			// 账号
	long balance;		// 可用余额
}

// 用于测试银行账户类的类
class AccountTester {

	public static void main(String[] args) {
		Account adachi = new Account();	    // 足立的账户
		Account nakata = new Account();	    // 仲田的账户

		adachi.name    = "足立幸一";		// 足立的账户名
		adachi.no      = "123456";			// 　〃的账号
		adachi.balance = 1000;				// 　〃的可用余额

		nakata.name    = "仲田真二";		// 仲田的账户名
		nakata.no      = "654321";			// 　〃的账号
		nakata.balance = 200;				// 　〃的可用余额

		adachi.balance -= 200;				// 足立取了200日元
		nakata.balance += 100;				// 仲田存了100日元

		System.out.println("■足立的账户");
		System.out.println(" 账户名：" + adachi.name);
		System.out.println(" 账号：" + adachi.no);
		System.out.println(" 可用余额：" + adachi.balance);

		System.out.println("■仲田的账户");
		System.out.println(" 账户名：" + nakata.name);
		System.out.println(" 账号：" + nakata.no);
		System.out.println(" 可用余额：" + nakata.balance);
	}
}
