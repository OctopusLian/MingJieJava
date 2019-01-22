﻿// 带定期存款的银行账户类【测试版】

class TimeAccount {
	private String name;			// 账户名
	private String no;				// 账号
	private long balance;			// 可用余额
	private long timeBalance;		// 可用余额（定期存款）

	//--- 构造函数 ---//
	TimeAccount(String n, String num, long z, long timeBalance) {
		name = n;						// 账户名
		no = num;						// 账号
		balance = z;					// 可用余额
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

	//--- 确认定期存款 ---//
	long getTimeBalance() {
		return timeBalance;
	}

	//--- 存入k日元 ---//
	void deposit(long k) {
		balance += k;
	}

	//--- 取出k日元 ---//
	void withdraw(long k) {
		balance -= k;
	}

	//--- 解除定期存款，全部转为普通存款 ---//
	void cancel(long k) {	
		balance += timeBalance;
		timeBalance = 0;
	}
}
