import java.util.Scanner;
public class Main{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      System.out.println("enter a number");
      int n = sc.nextInt();
      int a = 2,b,min,i;
      while(n > 0)
      {
         for(b = 2; b <= a; b++)
         {
            min = a < b ? a : b;
            for(i = 2; i <= min; i++)
            {
               if(a % i == 0 && b % i == 0)
                  break;
            }
            if(i == min + 1)
            {
               System.out.printf("\n%d and %d are co prime numbers",a,b);
               n--;
            }

         }
         a++;
      }
   }
}
