class Singleton
{
	private static Singleton val=null;
	private Singleton()
	{

	}
	public  static Singleton getobj()
	{
		if(val==null)
		
			val=new Singleton();
		    return val;
	}
}
class Practise
{
	public static void main(String[] args) {
		
		Singleton x = Singleton.getobj();
		System.out.println(Singleton.getobj());
		System.out.println(x);
		System.out.println(Singleton.getobj());
		
	}
}