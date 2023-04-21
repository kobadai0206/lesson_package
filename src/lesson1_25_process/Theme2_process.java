/*

 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

 */
package lesson1_25_process;

public class Theme2_process extends Status{
	// コンストラクター
	public Theme2_process() {
	} 
	// 名前
	private String name;

	// 名前の設定
	public void setName(String name) {
		this.name = name;
	}

	// プレイヤー名の取得
	public String getName() {
		return name;
	}

}

class Status {
	// ステータス
	private int hp;// HP
	private int mp;// MP
	private int attack;// 攻撃力
	private int speed;// 素早さ
	private int protect;// 防御力

	// HPの設定
	public void setHp(int hp) {
		this.hp = hp;
	}
	// HPの取得
	public int getHp() {
		return hp;
	}
	
	// MPの設定
	public void setMp(int mp) {
		this.mp = mp;
	}
	// MPの取得
	public int getMp() {
		return mp;
	}
	
	// 攻撃力の設定
	public void setAttack(int attack) {
		this.attack = attack;
	}
	// 攻撃力の取得
	public int getAttack() {
		return attack;
	}
	
	// 素早さの設定
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	// 素早さの取得
	public int getSpeed() {
		return speed;
	}
	
	// 防御力の設定
	public void setProtect(int protect) {
		this.protect = protect;
	}
	// 防御力の取得
	public int getProtect() {
		return protect;
	}

}
