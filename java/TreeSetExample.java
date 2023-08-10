import java.util.*;
class TreeSetExample
{
	public static void main(String[] args) 
	{
	    /* TreeSet <String>t = new TreeSet<String>();
	     t.add("Audi");
	     t.add("BMW");
	     t.add("Swift");
	     t.add("Baleno");
	     t.add("Baleno");
	     for(Object i:t)
	     System.out.println(i);
	 System.out.println(t.comparator());
	     System.out.println(t.first());
	     System.out.println(t.last());
	     System.out.println(t.headSet("Baleno"));
	     System.out.println(t.tailSet("BMW"));	*/
	     /*SortedSet s = new TreeSet();
	     s.add(22);
	     s.add(33);
	     s.add(11);
	     s.add(44);
	     s.add(55);
	     s.add('a');
	     s.add('b');
	     s.add('e');
	     s.add('z');
	     for(Object i : s)
	     System.out.println(i);
         System.out.println(s.comparator());*/
        /* TreeSet t = new TreeSet();
         t.add(10);
         t.add(20);
         t.add(13);
         t.add(12);
         t.add(17);
         t.add(19);
         t.add(15);
         t.add(14);
         System.out.println(t);
	}
}
class Std implements Comparator
{
	
	public int compare(Object ob1,Object ob2)
	{
           Integer i1 = (Integer)(ob1);
           Integer i2 = (Integer)(ob2);
          // return -i1.compareTo(i2);
          // return 1;
          //return -1;
         // return 0;
         // return i1.compareTo(i2);
           // return -i2.compareTo(i1);
            return i2.compareTo(i1);*/
           // TreeSet t = new TreeSet();
            TreeSet t = new TreeSet();
            t.add("eeeee");
            t.add("null");
            t.add("ffffff");
            t.add("ggggggg");
            t.add("ccc");
            t.add(10);
            t.add("a");
            t.add("dddd");
          // Object a = t.clone();
           //System.out.println(addAll(t));
           // System.out.println(t.remove("bb"));
            //System.out.println(t.pollFirst());
            //System.out.println(t.subSet("bb","ffffff"));

            System.out.println(t);

 	}
}
/*class Emp implements Comparator
{
	public int compare(Object ob1,Object ob2)
	{
		String s1 = (String)(ob1);
		String s2 = (String)(ob2);
		//return -1;
		//return 1;
		//return 0;
		//return s1.compareTo(s2);
		//return -s1.compareTo(s2);
		//return s2.compareTo(s1);
		//return -s2.compareTo(s1);
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1>l2)
        	//return 1;
        	return -1;
        else if (l2>l1)
        	 //return -1;
        	return 1;
        	else 
        		return 0;
	}
}*/