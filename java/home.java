import java.util.Scanner;
class home
{
	public static void main(String[] args) {
		float []marks = new float[6];
		float sum = 0,avg;
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks obained in 6 subject");
		for(int i=0;i<6;i++)
		{
			marks[i]= s.nextfloat();
		}
		for(int j=0;j<6;j++)
		{
			sum=sum+marks[j];
			avg=sum/6;
		}
		System.out.println("grade");
		if(avg>94)
		{
			System.out.println("A");
		}
		else if(avg>=90&&avg<94)
		{
			System.out.println("B");
		}
		else
			System.out.println("fail");
	}
}