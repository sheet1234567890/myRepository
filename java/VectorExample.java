import java.util.*;
class VectorExample
{
	public static void main(String[] args)
	{
	    Vector v = new Vector();
	    v.add(10);
	    v.add(20);
	    v.add(90);
	    v.add(1000);
	   // Enumeration e = v.elements();
	    Iterator i = v.iterator();
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }

	  //  System.out.println(e);
	   // System.out.println(e);
	  // System.out.println(e.hasMoreElements());
	   // while(e.hasMoreElements())
	   // {
	    	//System.out.println(e.nextElement());
	    	//System.out.println(e.nextElement());
	   // }
	   // System.out.println(i.hasNext());

	}
}