// 以0.001为单位从0.0递增至1.0，并显示合计值（用float控制循环）

class FloatSum1 {

	public static void main(String[] args) {
		float sum = 0.0F;

		for (float x = 0.0F; x <= 1.0F; x += 0.001F) {
			System.out.println("x = " + x);
			sum += x;
		}
		System.out.println("sum = " + sum);
	}
}
