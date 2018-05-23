package com.st.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		  
		System.out.println("Sorting by Name...");  
		  
		Collections.sort(al, new AgeComparator());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		Student st=(Student)itr.next();  
		System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());  
		}  
		
		System.out.println("By Name Sorting");
		
		Collections.sort(al,new NameComparator());  
		Iterator itr1=al.iterator();  
		while(itr1.hasNext()){  
		Student st=(Student)itr1.next();  
		System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge()); 
		}  

	}

}
