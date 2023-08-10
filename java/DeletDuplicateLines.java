import java.util.*;
import java.io.*;
class DeletDuplicateLines
{
	public static void main(String[] args)throws Exception 
	{
	  String filePath = "D:\\new java\\Sample.txt";
	  String input = null;
	  Scanner sc = new Scanner(new File(filePath));
	  FileWriter writer = new FileWriter("D:\\new java\\output.txt");
	  HashSet <String> set = new HashSet<String>();
	  while(sc.hasNextLine())
	  {
	  	input = sc.nextLine();
	  	if(set.add(input))
	  	{
	  		writer.append(input+" ");
	  	}
	  }
	  writer.flush();
	  System.out.print("contains added");	
	}
}