/*

	下記がコンソールに出力されるように作成してください

		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。

 */
package lesson1_20_22_process;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Theme2_process {
	// フィールドの定義
	private String country = "日本";
	private String food = "寿司";
	private String foodType = "和食";
	private LocalDateTime now = LocalDateTime.now();

	// 「こんにちは！」を表示するメソッド
	public void sayHello() {
		System.out.println("こんにちは！ここは" + this.country + "です！");
	}

	// 「この寿司はうまい」を表示するメソッド
	public void showSushi() {
		System.out.println("この" + this.food + "はうまい");
	}

	// 「寿司は和食です」を表示するメソッド
	public void showSushiType() {
		System.out.println(this.food + "は" + this.foodType + "です");
	}

	
	public void showCurrentTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String formatted = this.now.format(formatter);
		System.out.println("今の現在日時は" + formatted + "です");
	}
}
