/*

 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"

 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください

   	例:
   	8,5,9,.....
   	と入力された場合（昇順）

   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2

   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2

 */
package lesson1_28_29_process;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Theme2_process extends Prefecture {
	// スキャナーオブジェクトを生成
	Scanner scanner = new Scanner(System.in);

	// コンストラクタ
	public Theme2_process() {
	}

	public int[] InputScanner() {
		// 数値の入力を促すメッセージを表示
		System.out.print("コンソールにカンマ区切りで数値を入力してください：");
		// コンソールからの入力を受け取り
		String input = scanner.nextLine();
		//	カンマで分割してinteger配列に変換
		int[] ids = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
		// 入力された数値の配列を返す
		return ids;
	}

	public String InputSort() {
		// ソートの方法を入力させるメッセージを表示
		System.out.print("『昇順』または『降順』を入力してください：");
		//	入力の文字列を取得
		String sort = scanner.nextLine();
		return sort;
	}


	public void Process(String sort, int[] ids) {
		// 昇順でソートする場合の処理
		if ("昇順".equals(sort)) {
			// 配列を昇順にソート
			Arrays.sort(ids);
			// ソートされたidを元に都道府県情報を表示
			for (int i = 0; i < ids.length; i++) {
				this.setCitie(this.Prefectures[ids[i]]);
				System.out.println("都道府県名：" + getCitie()[0]);
				System.out.println("県庁所在地：" + getCitie()[1]);
				System.out.println("面積：" + Float.parseFloat(getCitie()[2]) + "km2");
				System.out.println();
			}
			// 降順でソートする場合の処理
		} else {
			// Integer配列に変換して降順にソートする
			Integer[] boxedArray = new Integer[ids.length];
			for (int i = 0; i < ids.length; i++) {
				boxedArray[i] = Integer.valueOf(ids[i]);
			}
			//	降順にソートする
			Arrays.sort(boxedArray, Collections.reverseOrder());
			// ソートされたidを元に都道府県情報を表示
			for (int i = 0; i < boxedArray.length; i++) {
				this.setCitie(this.Prefectures[boxedArray[i]]);
				System.out.println("都道府県名：" + getCitie()[0]);
				System.out.println("県庁所在地：" + getCitie()[1]);
				System.out.println("面積：" + Float.parseFloat(getCitie()[2]) + "km2");
				System.out.println();
			}

		}
	}
}

class Prefecture {
	// 都道府県、市区町村、面積の情報を保持する二次元配列
	protected String[][] Prefectures = {
			{"北海道", "札幌市", "83424"},
			{"青森県", "青森市", "9646"},
			{"岩手県", "盛岡市", "15275"},
			{"宮城県", "仙台市", "7282"},
			{"秋田県", "秋田市", "11638"},
			{"山形県", "山形市", "9323"},
			{"福島県", "福島市", "13784"},
			{"茨城県", "水戸市", "6097"},
			{"栃木県", "宇都宮市", "6408"},
			{"群馬県", "前橋市", "6362"},
			{"埼玉県", "さいたま市", "3798"}
	};

	// 市区町村を保持する配列
	private String[] citie;

	// IDを保持する変数
	private int id;

	// 面積を保持する変数
	private float area;

	// citieのgetterメソッド
	public String[] getCitie() {
		return citie;
	}
	// citieのsetterメソッド
	public void setCitie(String[] citie) {
		this.citie = citie;
	}

	// idのgetterメソッド
	public int getId() {
		return id;
	}
	// idのsetterメソッド
	public void setId(int id) {
		this.id = id;
	}

	// areaのgetterメソッド
	public float getArea() {
		return area;
	}
	// areaのsetterメソッド
	public void setArea(float area) {
		this.area = area;
	}

}

