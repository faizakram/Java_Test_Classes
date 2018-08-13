
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pers = "PROCESS / PROGRAM / PROJECT / SERVICE DELIVERY";
		if (pers.length() > 30) {
		  pers = pers.substring(0, 30) + "\n" + pers.substring(30, pers.length());
		}
		System.out.println(pers);
	}

}
