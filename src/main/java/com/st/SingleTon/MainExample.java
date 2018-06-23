package com.st.SingleTon;

public class MainExample {

	/*public static void main(String[] args) {
		SingleTonExample instance1 = SingleTonExample.instance;
        SingleTonExample instance2 = null;
        try {
			Class<SingleTonExample> singletonClass = (Class<SingleTonExample>) Class.forName("com.st.SingleTonExample");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try
        {
            Constructor[] constructors = 
                    SingleTonExample.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) 
            {
                // Below code will destroy the SingleTonExample pattern
                constructor.setAccessible(true);
                instance2 = (SingleTonExample) constructor.newInstance();
                break;
            }
        }
     
        catch (Exception e) 
        {
            e.printStackTrace();
        }
         
    System.out.println("instance1.hashCode():- "
                                      + instance1.hashCode());
    System.out.println("instance2.hashCode():- "
                                      + instance2.hashCode());
    }
*/  
	public static void main(String arg[]) {
		String eingabe = "A3B2F4A2";
		String ausgabe = "";
		char[] eingabeArray;

		eingabeArray = eingabe.toCharArray();

		for (int i = 0; i < eingabeArray.length; i++) {
			if (Character.isDigit(eingabeArray[i])) {
				for (int test = 0; test < Integer.parseInt(eingabeArray[i]+""); test++) {
					ausgabe = eingabeArray[i-1] + ausgabe;
				}
			}
		}

		System.out.println(ausgabe);
	}

}
	


