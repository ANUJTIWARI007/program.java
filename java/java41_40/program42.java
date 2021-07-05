import java.util.Scanner;
public class Main{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter lenth of fibbonic series");

       int x = sc.nextInt();
       int num1 = 0, num2 = 1, i,f;

       for(i = 1; i <= x; i++)
       {
         f = num1 + num2;
         System.out.println(f);
         num1 = num2;
         num2 = f;
       }
   }

}
