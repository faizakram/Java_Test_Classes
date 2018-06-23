package com.st.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MainExample {
	
	public static void main(String k[])
	{
		Map<Employee,String> map = new HashMap<Employee,String>();
		map.put(new Employee(1, "Faiz", 25), "Bihar");
		map.put(new Employee(1, "Faiz", 25), "Bihar");
		System.out.println(map.size());
		/*List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Faiz", 20));
		list.add(new Employee(2, "Akram Faiz", 23));
		list.add(new Employee(3, "kAbhi", 18));
		list.add(new Employee(4, "Dud", 21));
		list.add(new Employee(5, "Fai", 20));
		Collections.sort(list, new Comparator<Employee>(){
			  public int compare(Employee p1, Employee p2){
			    return p1.getAge().compareTo(p2.getAge());
			  }
			});
		Collections.sort(list, (Employee e1,Employee e2) -> {
			int cmp = e1.getAge().compareTo(e2.getAge());
			if(cmp == 0)
				cmp = e1.getName().compareTo(e2.getName());
			return cmp;
		});*/
		//List<Employee> list1 = (List<Employee>) list.stream().sorted();
		/*for(Employee emp: list)
			System.out.println(emp);*/
	}
}
