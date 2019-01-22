// 带定期存款的银行账户类【第1版】

class TimeAccount extends Account {
	private long timeBalance;			// 可用余额（定期存款）

	// 构造函数
	TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);		// 调用类Account的构造函数
		this.timeBalance = timeBalance;	// 可用余额（定期存款）
	}

	// 确认定期存款
	long getTimeBalance() {
		return timeBalance;
	}

	// 解除定期存款，全部转为普通存款
	void cancel(long k) {
		deposit(timeBalance);
		timeBalance = 0;
	}
}
