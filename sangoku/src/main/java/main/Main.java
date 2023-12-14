package main;

import busyo.Chokaku;
import busyo.Ryohu;
import ikusa.Ikusa;
import message.Message;

public class Main {
  public static void main(String[] args) {
	  Message message = new Message();
	  
	  //試合開始メッセージ
	  message.start();
	  
	  //1人目の武将紹介
	  message.busyoSyokai1();
	  Ryohu ryohu = new Ryohu();
	  
	  //2人目の武将紹介
	  message.busyoSyokai2();
	  Chokaku chokaku = new Chokaku();
	  
	  Ikusa ikusa = new Ikusa();
	  //戦闘開始
	  ikusa.ikusa(ryohu, chokaku);
	  
  }
}
