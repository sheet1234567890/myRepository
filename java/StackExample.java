import java .util.*;
class StackExample
{
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push("sheetal");
		s.push("ssss");
		s.push("pppp");
		//s.push("scscc");
		//s.push("sssccc");

		//int a = search(s);
		//System.out.println(a);
        Enumeration i = s.elemen();
		//List l =s.iterator();
       System.out.println(i);
		
	}
}