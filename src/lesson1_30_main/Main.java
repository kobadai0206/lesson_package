package lesson1_30_main;
import lesson1_30_person.Person;

class Main {
	public static void main(String[] args) {
		//	インスタンス化し引数を指定
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		//	bmiの計算メソッドを呼び出す
		double bmi = person1.bmi();
		//	BMI出力メソッド
		person1.print(bmi);

		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
	}
}
