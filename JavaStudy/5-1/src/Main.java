import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		{
			//      問① 下記の配列はString型しか格納できないように修正してください。
			//		   現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。

			//			List<String> array = new ArrayList<>();
			//	    <以下記述>
			List<String> strArray = new ArrayList<>();

			//      問② 前から二つ目の要素を"bar"にしましょう。
			//	　<以下記述>
			strArray.add("one");
			strArray.add("bar");
			strArray.add("foo");
			//      問③ fooが格納されているインデックスを出力してください。
			System.out.println("fooのインデックス：" + strArray.size());
			//	　<以下記述>
		}

		{
			//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
			Map<String, Object> map = new HashMap<>();
			//	　<以下記述>
			map.put("address", "////");
			map.put("name", "Kousuke");
			map.put("age", "29");
			//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
			//	    <以下記述>
			for (String key : map.keySet()) {
				System.out.println(key);
			}
			//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
			//	    <以下記述>
			for (Object value : map.values()) {
				System.out.println(value);
			}

			//      問⑦ 配列arrayDateに今の年・月・日を入れてください。
			Calendar cal = Calendar.getInstance();
			//	    <以下記述>
			Object arrayDate[] = { cal.get(Calendar.YEAR), cal.get(Calendar.MARCH) + 1, cal.get(Calendar.DATE) };
			//      問⑧ 配列arrayDateをList型に変更しましょう。
			//	    <以下記述>
			List listDate = Arrays.asList(arrayDate);
			//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
			//	    <以下記述>
			for (Object date : listDate) {
				System.out.println(date);
			}
		}
	}

}