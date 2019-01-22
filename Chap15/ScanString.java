// 逐个遍历字符串中的字符并显示

import java.util.Scanner;

class ScanString {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("字符串s：");
		String s = stdIn.next();

		for (int i = 0; i < s.length(); i++)
			System.out.println("s[" + i + "] = " + s.charAt(i));
	}
}