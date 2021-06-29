        
import java.util.Scanner;
public class Main{
public static void main(String[]args){
   System.out.println("enter a number");
   Scanner sc = new Scanner(System.in);

   int x = sc.nextInt();
   int i;
   for(i = 2; i <= x-1; i++)
   {
      if(x % i == 0)
      {
         System.out.println("composite number");
         return;
      }

   }
   System.out.println("prime number");

}
}
