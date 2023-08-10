import java.util.*;
import java.lang.*;
/*class ArraylistExample
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(1,1000);
	//	al.remove(1);
       Iterator i = al.iterator();
     // i.remove();
     //  System.out.println(al);
        while(i.hasNext()){
        	if()
		System.out.println(i.next());
	//	al.set(2,3000);
		//al.clear();
		//System.out.println(al.get(2));
	}
}*//*
class ArrayListExample
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		for(int i =0;i<10;i++)
		{
			al.add(i);

		}
		System.out.println(al);
		ListIterator i = al.listIterator();
		while(i.hasNext())
		{
			Integer a =(Integer) i.next();
			System.out.println(a+" ");
			if(a%2==0)
				i.remove();
		}
		System.out.println();
		System.out.println(al);
	}
}*//*
class ArrayListExample
{
	public static void main(String[] args) 
	{
	    ArrayList<Integer> ll = new ArrayList<Integer>();
		ll.add(101);
		ll.add(200);
		ll.add(301);
		ll.add(400);
	
		
		System.out.println(ll);
		ListIterator i = ll.listIterator();
		if(i%10==0)
			i.remove();
		System.out.println(ll);
		ListIterator i = ll.listIterator();
		System.out.println(i.hasNext());
		System.out.println(i.next()+"--------------------------");
		System.out.println(i.hasPrevious());
		System.out.println(i.previous());
		System.out.println(i.previousIndex());
		System.out.println(i.nextIndex());

		
		
		
	}
}*/
class ArrayListExample
{
	public static void main(String[] args) 
	{
	  ArrayList al = new ArrayList();
	  al.add(new StringBuffer("sheetal"));
	  al.add(new StringBuffer("sheetal"));
	  al.add(new StringBuffer("sheetal"));
	  al.add(new StringBuffer("She"));
	  System.out.println(al);	
	}
}