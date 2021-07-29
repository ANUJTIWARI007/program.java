import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a no of rows");
    int i,j;
    for(i = 1; i <= 4; i++)
   {
    for(j = 1; j <= 7; j++)
    {
      if(j >= i && j <= 8 - i)
      System.out.print("*");
      else
      System.out.print(" ");
    }
    System.out.print("\n");
   }
  }
}
