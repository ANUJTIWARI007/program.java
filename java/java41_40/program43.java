import java.util.Scanner;
public class Main{
   public static void main(String[]args){
      System.out.println("enter two numbers");

      Scanner sc = new Scanner(System.in);

      int x = sc.nextInt();
      int y = sc.nextInt();
      int i , min;

      min = x < y ? x : y ;

      for(i = 2; i <= min; i++)
      {
         if(x % i == 0 && y % i ==0)
            break;
      }
      if(i == min +1)
         System.out.printf("%d and %d is co prime numbers",x,y);
      else
         System.out.println("not co prime number");
   }
}
