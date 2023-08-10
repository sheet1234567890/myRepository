import java.util.*;
class HashmapExample
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		m.put(1,"sheetal");
		m.put(2,"surbhi");
		m.put(3,"rupali");
		m.put(4,"shivani");
		Set s = m.entrySet();
		System.out.println(m);
		System.out.println(s);
	  	
	}
}