// System.out.printf的测试程序

class PrintfTester {

	public static void main(String[] args) {
		System.out.printf("%d\n",  12345);	// 十进制数
		System.out.printf("%3d\n", 12345);	// 至少3位
		System.out.printf("%7d\n", 12345);	// 至少7位
		System.out.println();

		System.out.printf("%5d\n",  123);	// 至少5位
		System.out.printf("%05d\n", 123);	// 至少5位
		System.out.println();

		System.out.printf("%d\n", 13579);	// 十进制数
		System.out.printf("%o\n", 13579);	// 八进制数
		System.out.printf("%x\n", 13579);	// 十六进制数（小写字母）
		System.out.printf("%X\n", 13579);	// 十六进制数（大写字母）
		System.out.println();

		System.out.printf("%f\n",    123.45);	// 浮点数
		System.out.printf("%15f\n",  123.45);	// 整体15位
		System.out.printf("%9.2f\n", 123.45);	// 整体9位，小数部分2位
		System.out.println();

		System.out.printf("XYZ\n");				// 字符串（无转换）
		System.out.printf("%s\n",   "ABCDE");	// 字符串
		System.out.printf("%3s\n",  "ABCDE");	// 至少3位
		System.out.printf("%10s\n", "ABCDE");	// 至少10位
		System.out.println();
	}
}
