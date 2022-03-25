package mapping;


import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemapex {

	public static void main(String[] args) {
		TreeMap<Long,String> e=new TreeMap<Long,String>();
		
e.put(9834323232l,"Maha");
e.put(8934323232l,"vijai");
e.put(9874323232l,"Mahi");
e.put(7837483232l,"Bhuvana");
e.put(6873485234l,"Meena");
e.put(9683223232l,"Veena");
e.put(9634323232l,"Rahul");
e.put(6883323232l,"Kalai");
e.put(9037483232l,"Arul");
e.put(8073485234l,"Mohan" );

System.out.println(e);
System.out.println("**************************");
for(Entry<Long,String> m:e.entrySet())
{
	 System.out.println(m.getKey()+" "+m.getValue());
}

	}

}
