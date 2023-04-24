package lesson1_32_person;

public class Person{
	// フィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	// 人数の合計をカウントするフィールド
	public static int count = 0;
	
	// コンストラクタを定義（仮引数）
	public Person(String name, int age, double height, double weight){
		//	インスタンスフィールドに値をセット
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		// インスタンスが生成されたら人数の合計をインクリメント
		count++;
	}
	
	// BMIを計算するメソッド
	public double bmi(){
		return this.weight / this.height / this.height;
	}
	
	// 名前と年齢を出力するメソッド
	public void print(){
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	// 人数の合計を出力するメソッド
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}
}
