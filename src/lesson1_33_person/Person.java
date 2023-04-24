package lesson1_33_person;

public class Person{
	// クラス変数countを定義
	public static int count = 0;
	
	// フィールドを定義
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;
	
	// Personクラスのコンストラクタ,引数を指定
	public Person(String firstName, String lastName, int age, double height, double weight){
		 // このメソッドが呼ばれた時にクラス変数countをインクリメント
		Person.count++;
		
		//	フィールドに仮引数の値を代入
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// fullNameメソッドの定義
	public String fullName(){
		// firstNameとlastNameを結合してフルネームを返す
		return this.firstName + this.lastName;
	}

	// printメソッドの定義
	public void print(){
		// fullNameメソッドを呼び出してフルネームを表示
		System.out.println("名前は" + this.fullName() + "です");
		// フィールドageの値を表示
		System.out.println("年は" + this.age + "です");
	}
	
	// bmiメソッドの定義
	public double bmi(){
		// BMIを計算して戻り値に設定
		return this.weight / this.height / this.height;
	}
	
	// printCountメソッドの定義
	public static void printCount(){
		// クラス変数countの値を表示
		System.out.println("合計" + Person.count + "人です");
	}
}
