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
package lesson1_26_28_process;

public class Theme2_process extends animalStatus {
	//	コンストラクタ
	public Theme2_process() {
	}
	
	// animalsフィールドの宣言
	private String[] animals;
	
	// animalsフィールドのgetterメソッド
	public String[] getAnimals() {
		return animals;
	}
	
	// animalsフィールドのsetterメソッド
	public void setAnimal(String[] animals) {
		this.animals = animals;
	}
	
	// Animalsメソッドはanimalsフィールドに格納された動物の情報を出力するメソッド
	public void animals() {
		// animals配列の要素数分、以下の処理を繰り返す
		for(int i = 0; i < animals.length; i++) {
			// animals配列のi番目の要素を":"で分割して、animal配列に代入
			String[] animal = animals[i].split(":");
			// animalStatusクラスのsetterメソッドを使用して、animalStatusクラスのインスタンスに動物の情報をセットする
			this.setAnimal(animal[0]);
			this.setAnimal(Float.parseFloat(animal[1]));
			this.setAnimal(Integer.parseInt(animal[2]));
			// animalStatusクラスのgetterメソッドを使用して、動物の情報を出力する
			System.out.println("動物名：" + this.getAnimal());
			System.out.println("体長：" + this.getHeight() + "m");
			System.out.println("速度：" + this.getSpeed() + "km/h");
			
			// 動物名に応じて学名を出力する
			switch(this.getAnimal()){
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

class animalStatus {
	// 動物の種類を表す文字列
	private String animal;
	// 動物の身長を表す浮動小数点数
	private float height;
	// 動物の速度を表す整数値
	private int speed;
	
	// 動物の種類を取得するためのメソッド
	public String getAnimal() {
		return animal;
	}
	// 動物の種類を設定するためのメソッド
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	// 動物の身長を取得するためのメソッド
	public float getHeight() {
		return height;
	}
	// 動物の身長を設定するためのメソッド
	public void setAnimal(float animal) {
		this.height = animal;
	}
	
	// 動物の速度を取得するためのメソッド
	public int getSpeed() {
		return speed;
	}
	// 動物の速度を設定するためのメソッド
	public void setAnimal(int animal) {
		this.speed = animal;
	}
	
}
