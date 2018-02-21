# JavaHashMapClass2
HashMapクラス

## 処理
HashMapクラスを使って追加と削除。

## コード
```
import java.util.HashMap;

public class Sample37 {

	public static void main(String[] args) {
		HashMap<String, Integer> skills = new HashMap<String, Integer>();
		skills.put("攻撃力", 150);
		skills.put("防御力", 100);
		skills.put("魔法力", 200);
		skills.put("移動力", 380);
		System.out.println(skills.get("攻撃力"));
		System.out.println(skills.get("防御力"));
		System.out.println(skills.get("魔法力"));
		System.out.println(skills.get("移動力"));
		System.out.println(skills.size());
		System.out.println();

		String skill = "攻撃力";
		System.out.println(skills.get(skill));
		       skill = "防御力";
		System.out.println(skills.get(skill));
		skills.remove("魔法力");
		       skill = "魔法力";
		System.out.println(skills.get(skill));
		       skill = "移動力";
		System.out.println(skills.get(skill));
		System.out.println(skills.size());

	}

}
```

## 出力結果  
```
150
100
200
380
4

150
100
null
380
3
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
