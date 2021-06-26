import java.util.Scanner;

public class Main{
   public static void main(String [] args){
      System.out.println("power program");
      Scanner sc = new Scanner(System.in);

      System.out.println("enter a number and its power");

      int i , num = sc.nextInt();
      int power = sc.nextInt();

      long ans = 1l;

      for(i = 1; i <= power; i++){

         ans = ans * num;
      } 
      System.out.println(ans);
   }
}
