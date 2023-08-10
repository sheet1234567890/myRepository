/*class SheetalPatidar
{
	int id;
	String name;
	SheetalPatidar(int i,String n)
	{
		id = i;
		name=n;
	}
	SheetalPatidar(SheetalPatidar s)
	{
         id = s.id;
         name = s.name;
  	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
	   	
	   	SheetalPatidar s1 = new SheetalPatidar(10,"sheetal");
	   	SheetalPatidar s2 = new SheetalPatidar(s1);
	     s1.display();
	   	s2.display();
	}
} *//*
class Sheetalpatidar{  
    int id;  
    String name;  
    //constructor to initialize integer and string  
    Sheetalpatidar(int i,String n){  
    id = i;  
    name = n;  
    }  
    //constructor to initialize another object  
    Sheetalpatidar(Sheetalpatidar s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Sheetalpatidar s1 = new Sheetalpatidar(111,"Karan");  
    Sheetalpatidar s2 = new Sheetalpatidar(s1);  
    s1.display();  
    s2.display();  
   }  
} */ /*
class Sheetalpatidar
{
	int a,b;
    static String name = "ITS";
    void change(){
	name = "sjjjjjjj";
}

	Sheetalpatidar(int a,int b)

{
	this.a=a;
	this.b=b;
	 
}
void display()
{
	System.out.println(a+" "+b+" "+name);
}
	public static void main(String[] args) 
	{
	   Sheetalpatidar s = new Sheetalpatidar(10,20);
	   
	  Sheetalpatidar s1 = new Sheetalpatidar(30,40);
  	    s.display();
  	    s1.display();
  	    s1.change();
  	    s1.display();
  	    s.display();

	}
}*/
/*class Sheetalpatidar
{ 
	static 
	{
		System.out.println("..............");
		System.exit(0);
	}
	public static void main(String[] args) {
		Sheetalpatidar s= new Sheetalpatidar();
		s.main("..");
	}
}*//*
abstract class Test
{
	static int a; 
	Test(int a)
	{
		this.a = a;
	}
	static void display(){
		System.out.println(a);
	}
}
class Sheetalpatidar extends Test
{
	public static void main(String[] args) 
	{
		Sheetalpatidar t = new Sheetalpatidar(10);
		t.display();
	}
}*/
/*class Sheetalpatidar
{
	int id,age;
	String name,address;
	Sheetalpatidar(int age)
	{
		this. age=age;
	}
	Sheetalpatidar(int id,int age)
	{
		this.age = age;
		this .id = id;
	}
	Sheetalpatidar(int id, int age,String name,String address)
	{
		this(id,age);
		this .name = name;
		this.address=address;
	}
	void show()
	{
		System.out.println(id+" "+age+" "+name+" "+address);
	}
	public static void main(String[] args) 
	{
	     Sheetalpatidar s = new Sheetalpatidar(1,20,"sheetal","pidhay");
	     s.show();	
	}
}*//*
class A
{
	public void m1()
	{
		System.out.println("A...m1()");
	}
}
class B
{
	public void m2()
	{
		System.out.println("B...m2");
	}
}
class Sheetalpatidar extends B 
{
	public static void main(String[] args) 
	{
	   	Sheetalpatidar a  = new Sheetalpatidar();
	   	a.m2();
	   //	a.m2();
	}
}*/
class Sheetalpatidar
{    
	Sheetalpatidar(int a)
	{
		this();
		System.out.println(".......");
	}
	Sheetalpatidar()
	{
		System.out.println("*********");
	}
	public static void main(String[] args) 
	{
	   Sheetalpatidar s = new Sheetalpatidar(10);

	
}