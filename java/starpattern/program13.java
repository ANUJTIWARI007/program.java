import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    int i,j,k=1,s;
    for(i = 6; i >= 0; i--)
    {
      k = i;
    for(j = 0; j <= 6; j++)
    {
      if(j >= 0 && j <= i)
      {
        System.out.printf("%d",k);
        k--;
      }
      else
      {
        System.out.print(" ");
      }
    }
       System.out.print("\n");
   }
  }
}
