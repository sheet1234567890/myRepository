class Task16
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
}