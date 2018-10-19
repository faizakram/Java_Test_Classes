
public class LastIndexImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName ="abc.xyz.png";
		System.out.println(fileName.lastIndexOf("."));
		System.out.println(fileName.substring(fileName.lastIndexOf(".")+1, fileName.length()));
	}

}
