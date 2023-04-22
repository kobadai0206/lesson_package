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
package lesson1_25_dev;
import lesson1_25_process.Theme2_process;

public class Theme2 {
	public static void main(String[]args) {
		// プレイヤーのステータスをインスタンス化
		Theme2_process status = new Theme2_process();
		
		//	入力して、乱数をセットするメソッドを呼び出す
		status.Statusset();
		
		// プレイヤーのステータスを表示する
		System.out.println("こんにちは" + status.getName() + "さん");
		System.out.println("ステータス");
		System.out.println("HP：" + status.getHp());
		System.out.println("MP：" + status.getMp());
		System.out.println("攻撃力：" + status.getAttack());
		System.out.println("素早さ：" + status.getSpeed());
		System.out.println("防御力：" + status.getProtect());
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");

	}

}
