//===== ＣＤ播放器 =====//
public class CDPlayer implements Player {

	public void play() {						// ○播放
		System.out.println("□ＣＤ播放开始！"); 
	}

	public void stop() {						// ○停止
		System.out.println("□ＣＤ播放结束！"); 
	}

	public void cleaning() {				   // 清洗
		System.out.println("□已清洗磁头。"); 
	}
}
