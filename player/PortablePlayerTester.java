// 类PortablePlayer的使用示例

class PortablePlayerTester {

	public static void main(String[] args) {
		PortablePlayer a = new PortablePlayer();
		a.play();								// 播放
		a.stop();								// 停止
		a.changeSkin(Skinnable.LEOPARD);		// 将皮肤换成豹纹
	}
}
