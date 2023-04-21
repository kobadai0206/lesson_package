package lesson1_23_process;

public class Theme_process {
	//	名前、体長、速度のフィールドを定義
	private String name;
	private float height;
	private int speed;

	//	インスタンス化する時に呼び出す
	public Theme_process() {

	}
	//	getNameが呼ばれた時に格納されているnameの値を返す
	public String getName() {
		return name;
	}
	//	setNameが呼ばれた時に引数に渡された値をnameに格納する
	public void setName(String name) {
		this.name = name;
	}
	//	getHeightが呼ばれた時に格納されているheightの値を返す
	public float getHeight() {
		return height;
	}
	//	setHeightが呼ばれた時に引数に渡された値をheightに格納する
	public void setHeight(float height) {
		this.height = height;
	}
	//	getSpeedが呼ばれた時に格納されているspeedの値を返す
	public int getSpeed() {
		return speed;
	}
	//	setSpeedが呼ばれた時に引数に渡された値をspeedに格納する
	public void setSpeed(int speed) {
		this.speed = speed;
	}




}
