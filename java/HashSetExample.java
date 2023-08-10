import java.util.*;
class HashSetExample
{
	public static void main(String[] args)
	{   //ArrayList hs = new ArrayList();
		HashSet hs = new HashSet(5,0.3f);
		hs.add("sheetal");
		hs.add("sheetal");
		hs.add("patidar");
		hs.add("nnnnnn");
		hs.add("null");
		hs.add(10);
		//hs.clear();
		Iterator i = hs.iterator();
		//Object o = hs.clone();
		while(i.hasNext())
		//System.out.println(hs.remove("null"));
       System.out.println(i.next());
        System.out.println(hs);
	//	System.out.println(hs);
	}
}