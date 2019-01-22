// 改变字符串的引用目标

class ChangeString {

	public static void main(String[] args) {
		String s1 = "ABC";		// 引用"ABC"
		String s2 = "XYZ";		// 引用"XYZ"

		s1 = "XYZ";				// 引用"XYZ"
		System.out.println("字符串s1 = " + s1);
		System.out.println("字符串s2 = " + s2);
		System.out.println("s1和s2引用的" +
							((s1 == s2) ? "是相同的字符串常量。" : "不是相同的字符串常量。"));
	}
}
