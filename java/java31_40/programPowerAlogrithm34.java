// Program to calcuate x to the power of y.
//Time Complexicity: O(log(n))
import java.util.Scanner;

public class test{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        int a = sc.nextInt();
        int n = sc.nextInt();
        int res = 1;
        int cnt = 0;

        //2^4 = (2^2)^2 = (4)^2 = 16
        //2^3 = 2 * (2^2) = 2 * (4) = 8
        while (n > 0)
        {
            cnt++;
        	if (n % 2 != 0)
        	{
        		res = res * a;
        		n = n - 1; 
        	}
        	a = a * a;
        	n = n / 2;
        }
        
        System.out.println("Ans = " + res);
        System.out.println("Steps = " + cnt);

	}
}
