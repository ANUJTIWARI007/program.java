import java.util.Scanner;
public class Main{
   public static void main(String[]args){
      System.out.println("enter two numbers");

      Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();

      int max = a > b ? a : b;
      int less = a < b ? a : b;
      int i = 1,lcm = max;


      while(i>0)
      {

         if(lcm % less == 0)
         {
            System.out.println(lcm);
            break;
         } 
         lcm = max * i;
         i++;

      }
      int hcf = (a * b) / lcm;
     System.out.prinln(hcf);
   }
}
