import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public void addition() {
		StringBuilder str = new StringBuilder();
		call(str);
	}

	private void call(StringBuilder str) {
		str.append("Abc");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String pers = "PROCESS / PROGRAM / PROJECT / SERVICE DELIVERY"; if
		 * (pers.length() > 30) { pers = pers.substring(0, 30) + "\n" +
		 * pers.substring(30, pers.length()); } System.out.println(pers);
		 * 
		 * Test1 t1 =new Test1(); t1.addition();
		 */

		/*
		 * String str1 = "a, b, c,d"; List<String> list =
		 * Arrays.asList(str1.split(","));
		 * System.out.println(list.stream().noneMatch(str ->
		 * str.trim().equalsIgnoreCase("f")));
		 * 
		 * System.out.println(list.stream().anyMatch(str ->
		 * str.trim().equalsIgnoreCase("f"))); // list.stream().noneMatch(str ->
		 * str.trim().equals("B"));
		 * 
		 * 
		 */
		String str = "abc";
		String str1 = new String("abc");
		System.err.println(System.identityHashCode(str1) + "====" + System.identityHashCode(str));
	}

}
