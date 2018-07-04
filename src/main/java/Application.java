import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

interface IFruit
{
    public String TYPE = "Apple";
}

class Fruit implements IFruit
{

}
public class Application {
	
	public int solution(String S) {
        String[] str = S.split("[.?!]");
        System.out.println(str.length);
        List<Integer> data = new ArrayList<>();
        for(int i=0; i<str.length;i++)
        {	str[i] = str[i].trim();
        str[i] =  str[i].replaceAll("( +)"," ").trim();
        	String str1[] = str[i].split(" ");
        	data.add(str1.length);
        }
        System.out.println(data);
        return data.stream().reduce(Integer::max).get();
    }
	
	public int solution2(int A) {
        // write your code in Java SE 8
		int[]digits = Integer.toString(A).chars().map(c -> c-'0').toArray(); 
		List<Integer> data = new ArrayList<>();
		for(int i=0,j=digits.length-1; i<j; i++, j--)
		{
			if(i ==j)
			{
			    	data.add(digits[i]);
			    	break;
			}
			data.add(digits[i]);
			data.add(digits[j]);
		}
		
		int num = Integer.parseInt(data.toString().replaceAll("\\D",""));
		return num;
    }
	 public int solution(int[] array) {
		 
		OptionalInt a = Arrays.stream(array).max();
		int i=0;
		int j=1;
		
		for(; i <  a.getAsInt(); i++, j++)
		{
			final int ab =j;
			if(IntStream.of(array).anyMatch(x -> x == ab))
				continue;
			break;
		}
		 
		return j;
	        // write your code in Java SE 8
	        
	    }
	 
    public static void main(String[] args) {
        
    	Application application = new Application();
    	int arr[] = {1, 3, 6, 4, 1, 2};
    	//System.out.println(application.solution("Forget  CVs..Save time . x x"));
    	
    	System.out.println(application.solution2(123456));
    }
}