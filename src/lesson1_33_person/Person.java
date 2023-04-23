package lesson1_33_person;

public class Person{
	public static int count = 0;
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;

	public Person(String firstName, String lastName, int age, double height, double weight){
		Person.count++;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String fullName(){
		return this.firstName + this.lastName;
	}

	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi(){
		return this.weight / this.height / this.height;
	}

	public void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}
}