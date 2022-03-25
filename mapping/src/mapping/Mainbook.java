package mapping;

import java.util.HashMap;
import java.util.Map;

class book{
	int id;
	String name,author,publisher;
	int quantity;

	public book(int id,String name, String author,String publisher,int quantity)
	{
this.id=id;
this.author=author;
this.name=name;
this.quantity=quantity;
this.publisher=publisher;

}
}

public class Mainbook {
	

	public static void main(String[] args) {
		
HashMap<Integer,book>map=new HashMap<Integer,book>();
book b1= new book(101,"UGC NET BOOK","USHA RANI JAI","ARHANT B",8);
book b2= new book(202,"Data communication and Networking","Forouzan","mc graw hill",4);
book b3 = new book (231," data structure","lipschute","mcgraw",7);
book b4= new book(122,"network","freed","zpress",2);
map.put(1,b1);
map.put(2, b2);
map.put(3, b3);
map.put(4, b4);
for(Map.Entry<Integer,book>entry:map.entrySet())
{
	int key=entry.getKey();
	book b=entry.getValue();
	System.out.println(key+"Details: ");
	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
}

}

}
