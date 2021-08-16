import java.util.Scanner;
public class Main{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    int i , j , k  , s = 1 , t ;
    for(i = 1; i <= n ; i++)
    {
        k = s;
       for(j = 1; j <= (2*n - 1); j++)
       {
           if(j > n  - i && j < n + i)
           {
             System.out.printf("%d",k);
             t = j < n?k--:k++;
           }
           else
            System.out.print("#");
       }
        s++;
       System.out.print("\n");
    }
  }
}
