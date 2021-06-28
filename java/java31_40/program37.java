import java.util.Scanner;
public class Main{
   public static void main(String[]args){
      System.out.println("enter two numbers");

      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();

      
      int less = a < b ? a : b;

      while(less>0)
      {

         if(a % less == 0 && b % less ==0 )
         {
            System.out.println(less);
            break;
         } 

         less--;

      }
      
   }
}
