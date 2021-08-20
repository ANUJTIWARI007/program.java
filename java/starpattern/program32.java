import java.util.Scanner;
public class Main{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int i , j;
        int n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
          for(j = 1; j <= n; j++)
         {
            if(j == i || j == (n + 1) - i)
            {
                 System.out.print("*");
            }
            else
            {
                 System.out.print(" ");
            }
         }
          System.out.print("\n");
        }
    }
}
