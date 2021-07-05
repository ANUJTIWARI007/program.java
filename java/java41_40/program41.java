import java.util.Scanner;
public class test{
	public static void main(String[]args){
		System.out.println("prime factors program");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number");

		int x = sc.nextInt();
		int i;
		for(i = 2; x > 1; i++)
		{
			while(x % i == 0)
			{
				System.out.println(i);
				x = x / i;
			}
		}
	}
}
