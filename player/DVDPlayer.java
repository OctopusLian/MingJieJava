//===== ＤＶＤ播放器 =====//
class DVDPlayer implements ExPlayer {

	public void play() {									// ○播放 
		System.out.println("■ＤＶＤ播放开始！");
	}

	public void stop() {									// ○停止
		System.out.println("■ＤＶＤ播放结束！"); 
	}

	public void slow() {									// ●慢放
		System.out.println("■ＤＶＤ慢放开始！"); 
	}
}
