/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
package lesson1_23_dev;

public class Theme2 {
	public static void main(String[] args) {
		//	クラスAnimalをインスタンス化して引数を入れる
		Animal animal = new Animal("パンダ", 3.4f, 50);
		
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

class Animal {
	//	名前、体長、速度のフィールドを定義
	private String name;
	private float height;
	private int speed;
	
	//	インスタンス化する時に引数を指定して上記フィールドに格納
	Animal(String name, float height, int speed) {
		//	名前
		this.name = name;
		//	体長
		this.height = height;
		//	速度
		this.speed = speed;
	}
	//	getNameが呼ばれた時に格納されているnameの値を返す
	public String getName() {
		return name;
	}
	//	getHeightが呼ばれた時に格納されているheightの値を返す
	public float getHeight() {
		return height;
	}
	//	getSpeedが呼ばれた時に格納されているspeedの値を返す
	public int getSpeed() {
		return speed;
	}
	//	setNameが呼ばれた時に引数に渡された値をnameに格納する
	public void setName(String name) {
		this.name = name;
	}
	//	setHeightが呼ばれた時に引数に渡された値をheightに格納する
	public void setHeight(float height) {
		this.height = height;
	}
	//	setSpeedが呼ばれた時に引数に渡された値をspeedに格納する
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
