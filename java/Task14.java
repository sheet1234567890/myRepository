import java.util.Scanner;
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
}