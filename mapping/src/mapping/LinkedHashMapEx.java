package mapping;

import java.util.LinkedHashMap;

import java.util.Map.Entry;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		 LinkedHashMap<Integer,String> ob=new LinkedHashMap<Integer,String> ();
		 ob.put(22,"Mahalakshmi");
		 ob.put(24, "vijai");
		 ob.put(23,"mahi");
		 
		
		 System.out.println(ob);
		 System.out.println("***************************************** ");
		 for(Entry<Integer,String> m:ob.entrySet())
		 {
			 System.out.println(m.getKey()+" "+m.getValue());
		 }
		 

	}

}
