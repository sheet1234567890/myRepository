// 1.Write a java program to creat a new arrayList add  some element (string) and print out the collection
import java.util.*;

/*class Day2Task1
{
	public static void main(String[] args) 
	{
	  ArrayList<String>al= new ArrayList<String>();
	  al.add("sheetal");
	  al.add("surbhi");
	  al.add("sheevani");
	  al.add("Rupali");
	  System.out.println(al);	
	}
}*/
//2. Write a program to insert an element into the array element into the arraylist at the first position. 
/*class Day2Task2
{
	public static void main(String[] args) 
	{
	  	ArrayList al = new ArrayList();
	  	al.add(10);
	  	al.add(20);
	  	al.add(30);
	  	al.add(40);
	  	al.add(0,2000);
	  	System.out.println(al);
	}
}*/
// Write a java program to remove the third element from a array list
/*class Day2Task3
{
	public static void main(String[] args) 
	{
	  ArrayList al = new ArrayList();
	  al.add("sheetal");
	  al.add("surbhi");
	  al.add("sheevani");
	  al.add("rupali");
	  al.add("ssss");
	  System.out.println("Before remove :"+al);
	  al.remove(2);
	  System.out.println("After remove :"+al);	
	}
}*/
// 4.Write a program to sort given arrayList
/*class Day2Task4
{
	public static void main(String[] args) 
	{
	  ArrayList<Integer> al = new ArrayList<Integer>();
	  al.add(9);
	  al.add(7);
	  al.add(8);
	  al.add(5);
	  al.add(6);
	  al.add(4);

	 System.out.println("Before Sorting :- "+al);
      Collections.sort(al);
	  System.out.println("After Sorting :- "+al);
	  
	}
}*/
//5. Write a java program to shuffle elements in a ArrayList
/*class Day2Task5
{
	public static void main(String[] args) 
	{
	  ArrayList<String> al = new ArrayList<String>();
	  al.add("sheetal");
	  al.add("surbhi");
	  al.add("vandana");
	  al.add("khushboo");
	  System.out.println(al);
	  Collections.shuffle(al);
	  System.out.println(al);	
	}
}*/
//6.  Write a java Program to increse the size of an array list
/*class Day2Task6
{
	public static void main(String[] args) 
	{
	  	ArrayList<Integer> al = new ArrayList<Integer>(20);
	  	al.add(10);
	  	al.add(20);
	  	al.add(30);
	  	al.add(40);
	  	System.out.println(al);
	}
}*/
// 7. Write java program to reverse elements in a arrayList
/*class Day2Task7
{
	public static void main(String[] args) 
	{
	  int a[] = {100,200,300,400,500};
	  int s = 0,len = a.length-1;
	  while(s<len)
	  {
	  	int t = a[s];
	  	a[s]=a[len];
	  	a[len]=t;
	  	s++;
	  	len--;
	  }
	  for(int i=0;i<a.length;i++)
	  System.out.println(a[i]);
	}
}*/

//8. Write  a java program to compare two arraylist
 /*class Day2Task8
 {
 	public static void main(String[] args) 
 	{
 	  
     ArrayList<String> al = new ArrayList<String>();
     al.add("sheetal");
     al.add("surbhi");
     al.add("surbhi");
     al.add("sheetal");
     ArrayList <String> al1 = new ArrayList<String>();
     al1.add("sheetal");
     al1.add("surbhi....");
     al1.add("surbhi");
     al1.add("sheetal");
     boolean b = al1.equals(al);
     System.out.println(b);

 	}
 }*/
 //9. Write a java program to swap  two array element in a array list
 /*class Day2Task9
 {
 	public static void main(String[] args) 
 	{
 	  int a []={1,2,3,4};
 	  
 	  int t =0;
 	  for(int i =0 ;i<a.length-1;i++)
 	  {
 	  	 t = a[0];
 	  	a[0]=a[1];
 	  	a[1]=t; 
 	  	//System.out.println(a[1]);	  
 	  }
 	  for(int i =0;i<a.length;i++)
 	  System.out.print(a[i]+" ");	
 	}
 }*/

//10. Write a java program to join two ArrayList
/*class Day2Task10
{
	public static void main(String[] args) 
	{
	  ArrayList<Integer> al = new ArrayList<Integer>();
	  al.add(10);
	  al.add(20);
	  al.add(30);
	  al.add(40);
	  al.add(50);
	  System.out.println();
	  ArrayList<Integer> al1 = new ArrayList<Integer>(al);
	  al1.add(60);
	  al1.add(70);
	  al1.add(80);
	  al1.add(90);
	  al1.add(100);

	  System.out.println(al1); 	
	}
}*/
// 11.Write a java program to empty an array list
/*class Day2Task11
{
	public static void main(String[] args) 
	{
	  ArrayList al = new ArrayList();
	  if(al.isEmpty()==true)
	   System.out.println("ArrayList  empty ");
	  else if(al.isEmpty()==false)
	  	System.out.println("ArrayList element present");
	}
}*/
