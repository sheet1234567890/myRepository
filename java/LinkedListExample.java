import java.util.*;
/*class LinkedListExample
{
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);

		//ll.clear();
		//ll.remove(1);
		//ll.set(2,20000);
		System.out.println(ll);
	}
}*//*
class LinkedListExample
{
	public static void main(String[] args)
	{
	  LinkedList<String> ll = new LinkedList<String>();
	  ll.add("d");
	  ll.add("dd");
	  ll.add("ddd");
	  ll.add("dddd");
	  System.out.println(ll);
	  ListIterator <String> i = ll.listIterator(0);
	  while(i.hasNext())
	  {
	  	String i1 = i.next();
	  	System.out.println(i1);
	  }

	}
}*//*
class LinkedListExample
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		ll.add(90);
		ll.add(20);
		ll.add("sheetal");
		ListIterator i = ll.listIterator(2);
		System.out.println(i.hasNext());
		System.out.println(ll);
		try{i=ll.listIterator(6);
		System.out.println(i);}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}*/
class LinkedListExample
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> ll = new LinkedList<Integer> ();
		/*ll.add();
		ll.add('B');
		ll.add('C');
		ll.add('D');
		System.out.println(ll);
		ListIterator i = ll.listIterator(2);
		try{while(i.hasPrevious());
		{
			System.out.println(i.previous());
		}}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		for(int i=0;i<10;i++)
		{
			ll.add(i);
		}
		ListIterator l = ll.listIterator();
		while(!l.hasNext());
		{         Integer a =(Integer) l.next();
			System.out.println(a);
			if(a%2!=0)
				l.remove();

		System.out.println(ll);
		}
	}
}