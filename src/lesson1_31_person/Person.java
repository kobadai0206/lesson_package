package lesson1_31_person;

public class Person {
	// インスタンスフィールドを定義
	public String lastName;
	public String firstName;	
	public int age;
	public double height;
	public double weight;
	private static int totalPersons = 0;


	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String lastName, String firstName, int age, double height, double weight) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;

		//	メソッドが呼ばれたら1づつ増やす
		totalPersons++;
	}

	// BMIを計算するメソッド
	public double bmi() {
		double bmi = Math.floor(this.weight /  (this.height * this.height));
		//	計算したBMIを戻り値に指定
		return bmi;
	}

	// 情報を表示するメソッド
	public void print(double bmi) {
		System.out.println("「名前は" + this.lastName + "です」,");
		System.out.println("「BMIは" + bmi + "です」");
		System.out.println("「年は" + this.age + "才です」");

		System.out.println("合計" + totalPersons + "人です");
	}

	// フルネームを取得するメソッド
	public String fullName() {
		return this.lastName + this.firstName;
	}

	// Carを購入するメソッド
	public void buy(Car car) {
		//	フルネームをフィルドにセット
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}

	// Bicycleを購入するメソッド
	public void buy(Bicycle bicycle) {
		//	フルネームをフィルドにセット
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}




