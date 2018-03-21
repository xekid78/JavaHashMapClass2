/**
 *
 * @author xekid78
 *
 */
import java.util.HashMap;

public class Hashmap2 {

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
