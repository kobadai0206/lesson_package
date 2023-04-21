/*

 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50

  	コンソール出力結果

  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ

	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス

	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ

	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス

	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ

	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明


 */
package lesson1_26_28_dev;

import java.util.Scanner;

import lesson1_26_28_process.Theme2_process;

public class Theme2 {
	public static void main(String[]args) {
		Theme2_process process = new Theme2_process();
		String[] animals;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("コンソールに文字を入力してください");//	 入力画面
			String animalArray = scanner.next(); //文字列の入力の受け取り
			animals = animalArray.split(",");
		}

		for(int i = 0; i < animals.length; i++) {
			String[] animal = animals[i].split(":");
			process.setAnimal(animal[0]);
			process.setAnimal(Float.parseFloat(animal[1]));
			process.setAnimal(Integer.parseInt(animal[2]));
			System.out.println("動物名：" + process.getAnimal());
			System.out.println("体長：" + process.getHeight() + "m");
			System.out.println("速度：" + process.getSpeed() + "km/h");
			switch(process.getAnimal()){
			  case "ライオン":
			    System.out.println("学名：パンテラ レオ");
			    break;
			  case "ゾウ":
			    System.out.println("学名：ロキソドンタ・サイクロティス");
			    break;
			  case "パンダ":
			    System.out.println("学名：アイルロポダ・メラノレウカ");
			    break;
			  case "チンパンジー":
				  System.out.println("学名：パン・トゥログロディテス");
				  break;
			  case "シマウマ":
				  System.out.println("学名：チャップマンシマウマ");
				  break;
			  case "インコ":
				  System.out.println("学名：不明");
			}
			System.out.println();
		}


	}

}
