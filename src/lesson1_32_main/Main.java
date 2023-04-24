package lesson1_32_main;
import lesson1_32_person.Person;

class Main{
	public static void main(String[] argos){
		// Personクラスのインスタンスを生成(引数)
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		// person1の情報を出力
		person1.print();
		
		// Personクラスのインスタンスを生成（引数）
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		// person2の情報を出力
		person2.print();
		
		//	合計○○人ですとクラスフィールドを使って出力
		System.out.println("合計" + Person.count + "人です");
		
		// インスタンスのprintCountメソッドを呼び出して合計人数を出力
		Person.printCount();
	}
}

