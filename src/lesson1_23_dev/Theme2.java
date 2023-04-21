/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
package lesson1_23_dev;
import lesson1_23_process.Theme_process;

public class Theme2 {
	public static void main(String[] args) {
		//	クラスAnimalをインスタンス化する
		Theme_process animal = new Theme_process();
		
		//	setNameを呼び出してクラスanimalのnameをに格納する引数を指定する
		animal.setName("ライオン");
		//	setHeightを呼び出してクラスanimalのheightをに格納する引数を指定する
		animal.setHeight(2.1f);
		//	setSpeedを呼び出してクラスanimalのspeedをに格納する引数を指定する
		animal.setSpeed(80);
		
		//	コンソールにgetNameを使用して呼び出した値を表示
		System.out.println("動物名：" + animal.getName());
		//	コンソールにgetHeightを使用して呼び出した値を表示
		System.out.println("体長：" + animal.getHeight() + "m");
		//	コンソールにgetSpeedを使用して呼び出した値を表示
		System.out.println("速度：" + animal.getSpeed() + "km/h");
	}

}
