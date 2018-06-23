package com.st.DeleteFile;

import java.lang.reflect.Constructor;

import com.st.SingleTon.SingleTonExample;

public class MainExample {

	public static void main(String[] args) {
		SingleTonExample instance1 = SingleTonExample.instance;
        SingleTonExample instance2 = null;
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
    }

	


