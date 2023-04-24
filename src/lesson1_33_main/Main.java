package lesson1_33_main;

import lesson1_33_person.Person;

class Main{
	public static void main(String[] args){
		Person lastName1 = new Person("太郎");
		Person lastName2 = new Person("花子");
		// person1を作成(インスタンス化)
		Person person1 = new Person("鈴木", 20, 1.7, 60);
		//　表示
		person1.print();
		
		// person2を作成（インスタンス化）
		Person person2 = new Person("山田", 22, 1.5, 40);
		// 表示
		person2.print();
		
		// person1、person2処理が2回行われているのでその回数から人数を表示
		Person.printCount();
	}
}
