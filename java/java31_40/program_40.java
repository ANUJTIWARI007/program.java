import java.util.Scanner;

public class test{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		if (n == 1)
		{
			System.out.println("Neither prime nor composite");
			return;
		}

		for (int i = 2; i * i <= n; i++)
		{
			if (n % i == 0)
			{
				System.out.println("Composite");
				return;
			}
		}

		System.out.println("Prime");
	}
}
