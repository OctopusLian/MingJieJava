// 操作两个人的银行账户数据的程序

class Accounts {

	public static void main(String[] args) {
		String adachiAccountName    = "足立幸一";	// 足立的账户名
		String adachiAccountNo      = "123456";		// 　〃的账号
		long   adachiAccountBalance = 1000;			// 　〃的可用余额

		String nakataAccountName    = "仲田真二";	// 仲田的账户名
		String nakataAccountNo      = "654321";		// 　〃的账号
		long   nakataAccountBalance = 200;			// 　〃的可用余额

		adachiAccountBalance -= 200;				// 足立取了200日元
		nakataAccountBalance += 100;				// 仲田存了100日元

		System.out.println("■足立的账户");
		System.out.println(" 账户名：" + adachiAccountName);
		System.out.println(" 账号：" + adachiAccountNo);
		System.out.println(" 可用余额：" + adachiAccountBalance);

		System.out.println("■仲田的账户");
		System.out.println(" 账户名：" + nakataAccountName);
		System.out.println(" 账号：" + nakataAccountNo);
		System.out.println(" 可用余额：" + nakataAccountBalance);
	}
}
