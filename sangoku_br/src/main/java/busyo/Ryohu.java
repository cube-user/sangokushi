package busyo;

import senpo.ActiveSenpo1;
import senpo.ActiveSenpo2;
import senpo.KoyuSenpo;


public class Ryohu implements BusyoInterface {
	
	//データ
	final public String name = "呂布";
	
	public String koyuSenpoName;
	public String activeSenpo1Name;
	public String activeSenpo2Name;
	
	public double koyuSenpoDamage;
	public double activeSenpo1Damage;
	public double activeSenpo2Damage;
	
	public double koyuSenpoKaifuku;
	public double activeSenpo1Kaifuku;
	public double activeSenpo2Kaifuku;
	
	public int koyuSenpoHatsudoritsu;
	public int activeSenpo1Hatsudoritsu;
	public int activeSenpo2Hatsudoritsu;
	
	public int kSenpoHatsudoritsu;
	public int aSenpo1Hatsudoritsu;
	public int aSenpo2Hatsudoritsu;
	
	public int level = 45;
	public int hp = 500;
	public int buryoku = 90;
	public int tosotsu = 70;
	public double ikusaTosotsu = (double)this.tosotsu / 100;
	public int chiryoku = 10;
	public double ikusaChiryoku = (double)this.chiryoku / 100;
	public int sokudo = 70;
	
	//コンストラクタ
	public Ryohu() {		
		//固有戦法を設定する
		KoyuSenpo koyu = new KoyuSenpo();
		koyu.name = "天下無双";
		this.koyuSenpoName = koyu.name;
		koyu.damage = this.buryoku * 2.0;
		this.koyuSenpoDamage = koyu.damage;
		koyu.hatsudoritsu = 34;
		this.koyuSenpoHatsudoritsu = koyu.hatsudoritsu;
		
		//アクティブ戦法1を設定する
		ActiveSenpo1 senpo1 = new ActiveSenpo1();
		senpo1.name = "一騎当千";
		this.activeSenpo1Name = senpo1.name;
		senpo1.damage = this.buryoku * 1.7;
		this.activeSenpo1Damage = senpo1.damage;
		senpo1.hatsudoritsu = 39;
		this.activeSenpo1Hatsudoritsu = senpo1.hatsudoritsu;
		
		//アクティブ戦法2を設定する
		ActiveSenpo2 senpo2 = new ActiveSenpo2();
		senpo2.name = "鬼神霆威";
		this.activeSenpo2Name = senpo2.name;
		senpo2.damage = this.buryoku * 1.3;
		this.activeSenpo2Damage = senpo2.damage;
		senpo2.hatsudoritsu = 39;
		this.activeSenpo2Hatsudoritsu = senpo2.hatsudoritsu;
		
		//戦法発動率
		this.kSenpoHatsudoritsu = this.koyuSenpoHatsudoritsu + 1;
		this.aSenpo1Hatsudoritsu = this.activeSenpo1Hatsudoritsu + 1;
		this.aSenpo2Hatsudoritsu = this.activeSenpo2Hatsudoritsu + 1;
		
		System.out.println("--------------------");
		System.out.println("名前：" + this.name);
		System.out.println("レベル：" + this.level);
		System.out.println("兵力：" + this.hp);
		System.out.println("武力：" + this.buryoku);
		System.out.println("統率：" + this.tosotsu);
		System.out.println("知力：" + this.chiryoku);
		System.out.println("速度：" + this.sokudo);
		System.out.println("固有戦法：" + koyu.name);
		System.out.println("アクティブ戦法1：" + senpo1.name);
		System.out.println("アクティブ戦法2：" + senpo2.name);
		System.out.println("--------------------");
	}
	
	//戦法発動時のメソッド
	public void koyuSenpo() {
		System.out.println("【固有戦法】" + this.koyuSenpoName + "を発動");
	}
	
	public void activeSenpo1() {
		System.out.println("【戦法1】" + this.activeSenpo1Name + "を発動");
	}
	
	public void activeSenpo2() {
		System.out.println("【戦法2】" + this.activeSenpo2Name + "を発動");
	}
}
