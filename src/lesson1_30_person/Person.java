package lesson1_30_person;

public class Person {
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	private static int totalPersons = 0;

	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) {
		// フィールドに値を入れる
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		//	１回呼ばれるごとにカウントをプラス１ずつ増やす
		totalPersons++;
	}
	
	
	public double bmi() {
		// BMIの計算式を実装
		double bmi = Math.floor(this.weight /  (this.height * this.height));
		//	BMIの値を戻り値に設定
		return bmi;
	}
	
	public void print(double bmi) {
		// 名前、BMI、年齢を出力する
		System.out.println("名前は" + this.name + "です");
		System.out.println("BMIは" + bmi + "です");
		System.out.println("年は" + this.age + "才です");
		
		// 合計人数を出力する
		System.out.println("合計" + totalPersons + "人です");
	}
}
