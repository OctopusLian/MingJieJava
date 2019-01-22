// java.lang.Integer等类的摘录

public final class Character extends Object implements Comparable<Character> {
	public static final char MIN_VALUE = '\u0000';		// char型的最小值
	public static final char MAX_VALUE = '\uffff';		// char型的最大值
	//...
}

public final class Byte extends Number implements Comparable<Byte> {
	public static final byte MIN_VALUE = -128;			// byte型的最小值
	public static final byte MAX_VALUE = 127;			// byte型的最大值
	//...
}

public final class Short extends Number implements Comparable<Short> {
	public static final short MIN_VALUE = -32768;		// short型的最小值
	public static final short MAX_VALUE = 32767;		// short型的最大值
	//...
}

public final class Integer extends Number implements Comparable<Integer> {
	public static final int MIN_VALUE = 0x80000000;		// int型的最小值
	public static final int MAX_VALUE = 0x7fffffff;		// int型的最大值
	//...
}

public final class Long extends Number implements Comparable<Long> {
	public static final long MIN_VALUE = 0x8000000000000000L; // long型的最小值
	public static final long MAX_VALUE = 0x7fffffffffffffffL; // long型的最大值
	//...
}
