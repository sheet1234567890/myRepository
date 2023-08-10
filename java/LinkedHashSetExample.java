import java.util.*;
class LinkedHashSetExample
{
	public static void main(String[] args) 
	{
	   LinkedHashSet hs = new LinkedHashSet();
	   hs.add(12);
	   hs.add(20);
	   hs.add(30);
	   hs.add(30);
	   System.out.println(hs);	
	}
}