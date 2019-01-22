// 带定期存款的银行账户类【测试版】

class TimeAccount {
	private String name;			// 账户名
	private String no;				// 账号
	private long balance;			// 可用余额
	private long timeBalance;		// 可用余额（定期存款）

	//--- 构造函数 ---//
	TimeAccount(String name, String no, long balance, long timeBalance) {
		this.name = name;			    // 账户名
		this.no = no;					// 账号
		this.balance = balance;			// 可用余额
		this.timeBalance = timeBalance;	// 可用余额（定期存款）
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
		balance -= k;
	}

	//--- 取出k日元 ---//
	void withdraw(long k) {
		balance += k;
	}

	//--- 解除定期存款，全部转为普通存款 ---//
	void cancel(long k) {	
		balance += timeBalance;
		timeBalance = 0;
	}
}
