import java.util.Scanner;
public class array1{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int  a[] = new int[10];
		int s1=0,s2=0,i;
		System.out.println("enter 10 numbers");
		for( i = 0; i <= 9; i++)
		{
			a[i] = sc.nextInt();
		}
		for(i = 0; i <= 9; i++)
		{
			if(a[i]%2==0)
			{
				s1 = s1 + a[i];
			}
			else
			{
				s2 = s2 + a[i];
			}
		}
		System.out.printf("\nsum of even %d",s1);
		System.out.printf("\nsum of odd %d",s2);

	}
}
