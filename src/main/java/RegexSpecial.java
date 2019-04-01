import java.util.regex.Pattern;

public class RegexSpecial {

	public static void main(String[] args) {
		String str = "faizakr@am";
		 
	      Pattern p = Pattern.compile("[^a-z0-9]");
	      System.out.println(p.matcher(str).find());
	}
	      

}
