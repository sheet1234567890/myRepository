/*1.Write a java program to sum values of an array*/
/*import java.util.Scanner;
class Task1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a[]= new int[10];
		int sum = 0;
		for(int i =0;i<a.length;i++)
		{
			a[i]  = s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum); 
	}
}*/
/*2. Write a java program to find the index of an array element*/
/*import java.util.ArrayList;
class Task2
{
	public static void main(String[] args) 
	{
		 ArrayList al = new ArrayList();
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 al.add(40);
		 al.add(50);
		 int a = al.indexOf(20);
		 System.out.println(a);
		
		 
	}
}*/
// 3.Wruite a java program calcuate the average value of array
/*import java.util.*;
class Task3
{
	public static void main(String[] args) 
	{
	  int a[]={1,2,3,4,5};
	  int sum=0,avg=0;
	  for(int i=0;i<a.length;i++)
	  {
	  	sum=sum+a[i];
	  	avg = sum/a.length;
	  }	
	  System.out.println(avg);
	}
}*/
/*4. Write a java program to find the index of an array element*/
/*import java.util.ArrayList;
class Task4
{
	public static void main(String[] args) 
	{
		 ArrayList al = new ArrayList();
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 al.add(40);
		 al.add(50);
		 if(al.contains(20))
		 System.out.println( "contains");
		else
		 System.out.println("not contains");
		
		 
	}
}*/
/* 5.Write a java program to find the maximum and minimum value of an array*/
/*import java.util.Scanner;
class Task5
{
	
	public static void main(String[] args) 
	{
	  int a[] = new int[10];
	  int i,max;
	  Scanner s = new Scanner(System.in);
	  for(i=0;i<a.length;i++)
	  {
	  	a[i]=s.nextInt();
	  }	
	  max=a[0];
	  for(i=0;i<a.length;i++)
	  {
	  	if(a[i]>max)
	  	{
	  		max = a[i];
	  	}
	  }
	  System.out.println("max no is:-"+max);

	}
}*/
/*6. Write a java program to insert an element (Specific position ) into an array*/
/*import java .util.ArrayList;
class Task6
{
   public static void main(String[] args) 
   {
      ArrayList al = new ArrayList();
      al.add(10);
      al.add(20);
      al.add(30);
      al.add(40);
      al.add(50);
      al.add(1,300);
      System.out.println(al);

   }
}*/
/*7. Write a program to an array element reverse*/
/*import java.util.Scanner;
class Task7
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		int i=0;
		int l = arr.length-1;
		while(i<l)
		{
			int a = arr[i];
			arr[i] = arr[l];
			arr[l] = a;
			i++;
			l--;
		}
		for(i=0;i<arr.length;i++)
	{

		System.out.print(arr[i]+" ");
	}

	}
}*/
/*8. Write a java program to find the commen elements between two array*/
/*import java.util.*;
class Task8
{
	public static void main(String[] args) 
	{
	   int a []={1,2,5,3,7,9};
	   int b []={1,5,9};
	   for(int i=0;i<a.length;i++)
	   {
	   	 for(int j=0;j<b.length;j++)
	   	 {
	   	 	if(a[i]==(b[j]))
	   	 		System.out.println(b[j]);

	   	 }

	   } 	
	}	   
}*/
//9. write a program to find Duplicate value in array
/*class Task9
{
	public static void main(String[] args) 
	{
	  int a []={1,2,3,1,0,4,5,7,7,9,0,9,};
	  int len = a.length;
	  for(int i = 0;i<len;i++)
	  {
	  	for(int j=i+1;j<len;j++)
	  	{
	  		if(a[i]==a[j])
	  			System.out.println(a[i]);
	  	}
	  }
	  

	}
}*/
//10. write a program to convert array to arrayList
/*import java.util.*;
class Task10
{
	public static void main(String[] args) 
	{
	   int a[] = new int[10];
	   ArrayList al = new ArrayList();
	   for(int i =0;i<a.length;i++)
	   {
	   	al.add(i);
	   }
	   System.out.println(al);
	}
}*/
//11.write a java program to add two matrices of the same size
/*class Task11
{
	public static void main(String[] args) 
	{
	  int a[][]={{1,2},{3,4}};
	  int b[][]={{1,2},{3,4}};
	  int c[][]= new int[2][2];
	  for(int i=0;i<a.length;i++)
	  {
	  	for(int j=0;j<b.length;j++)
	  	{
	  		c[i][j]=a[i][j]+b[i][j];
	  		System.out.println(c[i][j]);
	  	}
	  }	
	}
}*/
//12.write a java program to find second largest number from the array 
/*class Task12
{
	public static void main(String[] args) 
	{
	   int a[]={1,2,3,4,5,6,7,8,9};
	   int i, max,smax;
	   if(a[1]>a[0])
	   {
	   	max = a[1];
        smax = a[0];
	   }
	   else
	   {
	   	max = a[1];
        smax = a[0];
       }
       for(i=2;i<a.length;i++)
       {
       	if(a[i]>max)
       	{
       		smax =  max;
       		max=a[i];

       	}
       	else if(a[i]<max&&a[i]>smax)
       	{
       		smax=a[i];
       	}
       }
   //    System.out.println("max no is :"+max);
       System.out.println("smax no is :"+smax);
	}
}*/
//13.write a program to find second lowest number from the array
/*class Task13
{
	public static void main(String[] args) 
	{
	   int a[]= {10,20,4,0,23,40,-1,5,6,2};
	   int i,min,smin;
	   if(a[1]>a[0])
	   {
	   	min = a[0];
	   	smin = a[1];
	   }
	   else
	   {
	   	min = a[1];
	   	smin = a[0];
	   }
         for(i=2;i<a.length;i++)
         {
             if(a[i]<min)
             {
             	smin = min ;
             	min = a[i];
             }
             else if(a[i]>min&&a[i]<smin)
             {
             	smin=a[i];
             }
         }
        System.out.println(smin);
        // System.out.println(min);
	   }	
	}*/
//14.Write a program to find the number of odd and even 	
/*import java.util.Scanner;
class Task14
{
	public static void main(String[] args) 
	{
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
	  Integer a[]= new Integer[size];
      for(int i =0;i<size;i++)
      {
         a[i]=s.nextInt();
      }
      for(int i:a)
      if(i%2==0)
      System.out.println("Even no :"+i);
     else
  	  System.out.println("Odd no :"+i);

	}
}*/
//15write a java program to get the difference between the largest and smallest values in an array of Integers
/*class Task15
{
	public static void main(String[] args) 
	{
	   int a[] = {41,3,12,34,23,20,45,4,5,6};
	   int i,l=a.length,diff=0,last=a.length-1;
	   //System.out.println(l);
	   for(i=0;i<l;i++)
	   {
	   	 for(int j=i+1;j<l;j++)
	   	 if(a[i]>a[j])
	   	 {
	   	   int d = a[j];
	   	   a[j]=a[i];
	   	   a[i]=d;
	     }
	   
	   	  System.out.println(a[i]);
        }
	   	  
     System.out.println(a[last]-a[0]+"-:Diffrence array larest and lowest element");
	
    }
}*/
//16 Write a java program to segrated all 0s on left side and all 1s on right side of a given array
/*class Task16
{
	public static void print(int a[])
	{
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	}
	public static void main(String[] args) 
	{
	  int a[]={1,1,0,1,0,1,1,1,0,0,0};
	  int s=0;
	  for(int i=0;i<a.length;i++)
	  {
	  	if(a[i]==0)
	  	{
	  		int temp = a[s];
	  		a[s] = a[i];
	  		a[i] = temp;
	  		s++;
	  	}
	  }
	  print(a);

	}
}*/
// 19 Write a java program to cyclically rotate a given array clockwise by one :
/*import java.util.*;
class Task19
{
	public static void main(String[] args) 
	{
	  Scanner s =new Scanner(System.in);
	  System.out.println("Enter the required size of the array: :");
	  int size = s.nextInt();
	  int [] m = new int[size];
	  System.out.println("Enter elemet of the array");
	  for(int i=0;i<size;i++)
	  {
	  	m[i]=s.nextInt();

	  }	
	  System.out.println(Arrays.toString(m));
	  int temp = m[size-1];
	  for(int i= size-1;i>0;i--)
	  {
	  	m[i]=m[i-1];
	  }
	  m[0]=temp;
	  System.out.println(Arrays.toString(m));
	}
}*/
// 18. write a java program to find unique element in an array
/* import java.util.*;     
class Task18 
{   
    public static void main (String[] args)   
    {   
     
        int a[] = { 100,98,97,96,95,94 ,94,94,94};     
        int len = a.length;  
        HashSet<Integer> hs = new HashSet<Integer>();  
        for (int i = 0; i < len; i++)   
        { 
            if (!hs.contains(a[i]))   
            {   
                hs.add(a[i]);   
            }   
        }  
        System.out.print(hs);   
    }   
} */
//19. write a program to sort array asscending order
/*class Task18 {    
    public static void main(String[] args) {        
            
            
        int [] arr = new int [] {5, 2, 8, 7, 1};     
        int temp = 0;    
            
       
        System.out.println("array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }   
             
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }      
       System.out.println();    
        System.out.println("ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
} */
// 20.write a java program to sort Array in decending order;
/*class Task20
{
	public static void main(String[] args) 
	{
	  int a[]=new int[]{1,5,6,7,8,9,10,11};
	  int temp=0;
	  System.out.println("array:");
	  for (int i = 0; i < a.length; i++) 
	    {     
            System.out.print(a[i] + " ");    
        }   
             
        for (int i = 0; i < a.length; i++) 
        {     
            for (int j = i+1; j < a.length; j++)
             {     
               if(a[i] < a[j]) 
               {    
                   temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
               }     
            }     
        }      
       System.out.println();    
        System.out.println("descending order: ");    
        for (int i = 0; i < a.length; i++) {     
            System.out.print(a[i] + " ");    
        }    
    }    	
}*/
//write a java program to sort Names in an alphabatical order
/*import java.util.*;
class Task21
{
	public static void main(String[] args) 
	{
	  ArrayList<String>al= new ArrayList<String>();
	  al.add("Deepali");
	  al.add("Chetan");
	  al.add("Bindu");
	  al.add("Element");
	  al.add("Aishwarya");
	  al.add("Vidhya");
	  
	  TreeSet<String>hs=new TreeSet<String>(al);
	  System.out.println(hs);	
	}
}*/
//22.write a java program to search key Element in an array;
/*import java.util.Scanner;
class Task22
{
	public static void main(String[] args) 
	{
	  int n,x,f=0,i=0;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter no :");
	  n= sc.nextInt();
	  int a[]=new int[n];
	  System.out.println("Enter all elemets");
	  for(i=0;i<n;i++)
	  {
	  	a[i]=sc.nextInt();
	  }
	  System.out.println("Enter element ");
	  x=sc.nextInt();
	  for(i=0;i<n;i++)
	  {
	  	if(a[i]==x)
	  	{
	  		f=1;
	  	break;
        }
	  else
	  {
	  	f=0;
	  }
	}
	  if(f==1)
	  {
	  	System.out.println("Element found at position :-> "+(i+1));

	  }
	  else
	  {
	  	System.out.println("Elemnt not found");
	  }

	}
}*/


