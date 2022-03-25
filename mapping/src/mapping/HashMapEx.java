package mapping;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		 HashMap<Integer,String> ob=new HashMap<Integer,String> ();
		 ob.put(9, "Mahalakshmi");
		 ob.put(8,"mahi");
		 ob.put(7, "vijai");
		
		 ob.put(5,"Ravi");
		 System.out.println(ob);
		 System.out.println("***************************************** ");
		 for(Map.Entry<Integer,String>m:ob.entrySet())
		 {
			 System.out.println(m.getKey()+" "+m.getValue());
		 }
		 
		 
	}

}
