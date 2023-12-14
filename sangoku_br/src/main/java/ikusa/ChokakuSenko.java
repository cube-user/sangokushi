package ikusa;

import java.util.Random;

import busyo.Chokaku;
import busyo.Ryohu;

public class ChokakuSenko {
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
	
	public int kaifuku22;
	public int kaifuku33;
	
	public void ikusa(Ryohu ryohu, Chokaku chokaku) {
		Random random = new Random();   
		//張角のターン
		System.out.println("★★★速度の影響により" + chokaku.name + "が先攻★★★");
		
		//張角の固有戦法発動の抽選
		int iValue4 = random.nextInt(100);
		System.out.println(chokaku.koyuSenpoName + "の発動率は" + chokaku.kSenpoHatsudoritsu + "%");
		if(iValue4 <= chokaku.koyuSenpoHatsudoritsu) {
			System.out.println(chokaku.koyuSenpoName + "の発動に成功");
			this.damage1 = ryohu.ikusaTosotsu * chokaku.koyuSenpoDamage;
			this.damage11 = (int)Math.floor(this.damage1);
			ryohu.hp = ryohu.hp - this.damage11;
			System.out.println(ryohu.name + "は【" + this.damage11 + "】の兵力を失った");
			System.out.println(ryohu.name + "の兵力は残り【" + ryohu.hp + "】");
			System.out.println("");
		} else {
			System.out.println("発動に失敗");
			System.out.println("");
		}
		//張角の戦法1発動の抽選
		int iValue5 = random.nextInt(100);
		System.out.println(chokaku.activeSenpo1Name + "の発動率は" + chokaku.aSenpo1Hatsudoritsu + "%");
		if(iValue5 <= chokaku.activeSenpo1Hatsudoritsu) {
			System.out.println(chokaku.activeSenpo1Name + "の発動に成功");
			this.damage2 = ryohu.ikusaTosotsu * chokaku.activeSenpo1Damage;
			this.damage22 = (int)Math.floor(this.damage2);
			ryohu.hp = ryohu.hp - this.damage22;
			this.kaifuku22 = (int)Math.floor(chokaku.activeSenpo1Kaifuku);
			chokaku.hp = chokaku.hp + this.kaifuku22;
			System.out.println(ryohu.name + "は【" + this.damage22 + "】の兵力を失った");
			System.out.println(ryohu.name + "の兵力は残り【" + ryohu.hp + "】");
			System.out.println(chokaku.name + "は【" + this.kaifuku22 + "】の兵力を回復した");
			System.out.println(chokaku.name + "の兵力は残り【" + chokaku.hp + "】");
			System.out.println("");
		} else {
			System.out.println("発動に失敗");
			System.out.println("");
		}
		//張角の戦法2発動の抽選
		int iValue6 = random.nextInt(100);
		System.out.println(chokaku.activeSenpo2Name + "の発動率は" + chokaku.aSenpo2Hatsudoritsu + "%");
		if(iValue6 <= chokaku.activeSenpo1Hatsudoritsu) {
			System.out.println(chokaku.activeSenpo2Name + "の発動に成功");
			this.kaifuku33 = (int)Math.floor(chokaku.activeSenpo2Kaifuku);
			chokaku.hp = chokaku.hp + this.kaifuku33;
			System.out.println(chokaku.name + "は【" + this.kaifuku33 + "】の兵力を回復した");
			System.out.println(chokaku.name + "の兵力は残り【" + chokaku.hp + "】");
			System.out.println("");
		} else {
			System.out.println("発動に失敗");
			System.out.println("");
		}
		
		//呂布のターン
				System.out.println("★★★速度の影響により" + ryohu.name + "が後攻★★★");
				//呂布の固有戦法発動の抽選
				int iValue1 = random.nextInt(100);
				System.out.println(ryohu.koyuSenpoName + "の発動率は" + ryohu.kSenpoHatsudoritsu + "%");
				if(iValue1 <= ryohu.koyuSenpoHatsudoritsu) {
					System.out.println(ryohu.koyuSenpoName + "の発動に成功");
					this.damage1 = chokaku.ikusaTosotsu * ryohu.koyuSenpoDamage;
					this.damage11 = (int)Math.floor(this.damage1);
					chokaku.hp = chokaku.hp - this.damage11;
					System.out.println(chokaku.name + "は【" + this.damage11 + "】の兵力を失った");
					System.out.println(chokaku.name + "の兵力は残り【" + chokaku.hp + "】");
					System.out.println("");
				} else {
					System.out.println("発動に失敗");
					System.out.println("");
				}
				//呂布の戦法1発動の抽選
				int iValue2 = random.nextInt(100);
				System.out.println(ryohu.activeSenpo1Name + "の発動率は" + chokaku.aSenpo1Hatsudoritsu + "%");
				if(iValue2 <= ryohu.activeSenpo1Hatsudoritsu) {
					System.out.println(ryohu.activeSenpo1Name + "の発動に成功");
					this.damage2 = chokaku.ikusaTosotsu * ryohu.activeSenpo1Damage;
					this.damage22 = (int)Math.floor(this.damage2);
					chokaku.hp = chokaku.hp - this.damage22;
					System.out.println(chokaku.name + "は【" + this.damage22 + "】の兵力を失った");
					System.out.println(chokaku.name + "の兵力は残り【" + chokaku.hp + "】");
					System.out.println("");
				} else {
					System.out.println("発動に失敗");
					System.out.println("");
				}
				//呂布の戦法2発動の抽選
				int iValue3 = random.nextInt(100);
				System.out.println(ryohu.activeSenpo2Name + "の発動率は" + ryohu.aSenpo2Hatsudoritsu + "%");
				if(iValue3 <= ryohu.activeSenpo1Hatsudoritsu) {
					System.out.println(ryohu.activeSenpo2Name + "の発動に成功");
					this.damage3 = chokaku.ikusaTosotsu * ryohu.activeSenpo2Damage;
					this.damage33 = (int)Math.floor(this.damage3);
					chokaku.hp = chokaku.hp - this.damage33;
					System.out.println(chokaku.name + "は【" + this.damage33 + "】の兵力を失った");
					System.out.println(chokaku.name + "の兵力は残り【" + chokaku.hp + "】");
					System.out.println("");
				} else {
					System.out.println("発動に失敗");
					System.out.println("");
				}
	}
}
