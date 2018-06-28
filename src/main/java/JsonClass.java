import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class JsonClass {
	
	private String name;
	private Map<String, String> clinicalInfo;
	
	
	public static void main(String k[])
	{
		List<String> als = new ArrayList<String>();
		als.add("sherin");
		als.add("Sherin");
		
		als.add("SHERIN");
		als.add("bubBle");
		als.add("buBble");

		als.add("BUBBLE");
		als.add("heart");
		als.add("hEart");
		als.add("hEArt");
		//Stream.of(als).sorted();
		Stream.of("sherin", "Sherin", "SHERIN", "bubBle", "buBble", "BUBBLE", "heart", "hEart", "hEArt").sorted((s1, s2) -> {
		    int tmp = s1.compareToIgnoreCase(s2);
		    return tmp == 0 ? 
		        s1.compareTo(s2) //Compare equivalent values based on the case
		        : tmp;
		    }).forEach(System.out::println);
		
		
		
		
		
		/*Collections.sort(als,new Comparator<String>() {

	        @Override
	        public int compare(String o1, String o2) {
	            //I want to alter this part
	            int dif=o1.compareTo(o2); 
	            return dif;
	        }

	    });*/
		
		System.out.println(als);
	}

}
