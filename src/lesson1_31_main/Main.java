package lesson1_31_main;

import lesson1_31_person.Bicycle;
import lesson1_31_person.Car;
import lesson1_31_person.Person;

class Main {
	public static void main(String[] args) {
		//	インスタンス化し引数入れる
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		Person person2 = new Person("山田", "花子", 26, 1.6, 50);
		
		//	BMI計算メソッドを呼び出す
		double bmi = person1.bmi();
		//	戻り値のBMIを引数に入れてprintメソッドを呼び出して表示
		person1.print(bmi);
		
		//	インスタンス化
		Car car = new Car();
		//	インスタンス化
		Bicycle bicycle = new Bicycle();

		//ownerを設定しフルネームにしてセットする
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());
		//	コンソールに表示
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		
		//	購入者をフルネームにして表示するメソッドを呼び出す
		person1.buy(car);
		person2.buy(bicycle);

		
		System.out.println(person1.lastName);
		System.out.println(person1.age);
		System.out.println(person1.height);
	}
}
