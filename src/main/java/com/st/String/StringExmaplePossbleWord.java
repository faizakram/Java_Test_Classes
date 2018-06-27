package com.st.String;

public class StringExmaplePossbleWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[] dist = {"go","bat","me","eat","goal", 
            "boy", "run"}; 
		char arr[] = {'e','o','b', 'a','m','g', 'l'};
		//Stream<char[]> cStream = Stream.of(arr);
		//String str = new String(arr);
		//System.out.println(str);
		for(int i =0 ; i< dist.length; i++)
		{
			String str = dist[i];
			for(int j=0; j < dist[i].length(); j++)
			{
				
			}
		}*/
		
		String line = "hi this is faiz";
		
		String [] str = line.split(" ");
		for(int i = str.length-1; i >= 0; i--)
		{
			System.out.print(str[i] +" ");
		}
	}

}
