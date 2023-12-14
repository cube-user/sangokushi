package ikusa;

import busyo.Chokaku;
import busyo.Ryohu;

public class Ikusa {
	public int kHatsudoritsu;
	public int aHatsudoritsu1;
	public int aHatsudoritsu2;
	
	public int kHatsudoritsu1;
	public int aHatsudoritsu3;
	public int aHatsudoritsu4;	
	
	public double damage1;
	public int damage11;
	public double damage2;
	public int damage22;
	public double damage3;
	public int damage33;
	
	public int kaifuku33;
	
	//戦報詳細
	public void ikusa(Ryohu ryohu, Chokaku chokaku) {
		
		System.out.println("");
		System.out.println("戦報詳細");
		
		for(int i = 1;i <= 8 && (int)ryohu.hp > 0 && (int)chokaku.hp > 0; i++) {
			System.out.println(i + "ターン目----------");
			//1ターン目の攻防
			if(ryohu.sokudo > chokaku.sokudo) {
				//呂布が先攻の場合
				RyohuSenko ryohuSenko = new RyohuSenko();
				ryohuSenko.ikusa(ryohu, chokaku);
			} else {
				//張角が先攻の場合
				ChokakuSenko chokakuSenko = new ChokakuSenko();
				chokakuSenko.ikusa(ryohu, chokaku);
			}
		}
		if(ryohu.hp == 0) {
			System.out.println("");
			System.out.println("●●●●張角の勝利●●●●");
		} else if(chokaku.hp == 0){
			System.out.println("");
			System.out.println("●●●●呂布の勝利●●●●");
		} else {
			System.out.println("");
			System.out.println("●●●●引き分け●●●●");
			System.out.println("呂布の残兵力は【" + ryohu.hp + "】です");
			System.out.println("張角の残兵力は【" + chokaku.hp + "】です");
		}

	}
}
