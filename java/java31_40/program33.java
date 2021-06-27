import java.util.Scanner;

public class Main{
   public static void main(String [] args){
      System.out.println("count program");
      Scanner sc = new Scanner(System.in);

      System.out.println("enter a number ");

      int i = 0, num = sc.nextInt();
      int  N;
      
      while(num>0)
      {
         num = num / 10;
         i++;

      }
      System.out.println(i);
   }
}
