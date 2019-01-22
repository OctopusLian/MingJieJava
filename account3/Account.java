﻿// 银行账户类【第3版】

public class Account {

	private static int counter = 0;		// 赋到了哪一个标识编号

	private String name;		// 账户名
	private String no;			// 账号
	private long balance;		// 可用余额
	private int id;				// 标识编号

	//-- 构造函数 --//
	public Account(String n, String num, long z) {
		name = n;				// 账户名
		no = num;				// 账号
		balance = z;			// 可用余额
		id = ++counter;			// 标识编号
	}

	//--- 确认账户名 ---//
	public String getName() {
		return name;
	}

	//--- 确认账号 ---//
	public String getNo() {
		return no;
	}

	//--- 确认可用余额 ---//
	public long getBalance() {
		return balance;
	}

	//--- 获取标识编号 ---//
	public int getId() {
		return id;
	}

	//--- 存入k日元 ---//
	public void deposit(long k) {
		balance += k;
	}

	//--- 取出k日元 ---//
	public void withdraw(long k) {
		balance -= k;
	}
}
