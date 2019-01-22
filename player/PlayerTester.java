// 接口Player的使用示例

class PlayerTester {

	public static void main(String[] args) {
		Player[] a = new Player[2];
		a[0] = new VideoPlayer();	// 视频播放器
		a[1] = new CDPlayer();		// ＣＤ播放器

		for (Player p : a) {
			p.play();				// 播放
			p.stop();				// 停止
			System.out.println();
		}
	}
}
