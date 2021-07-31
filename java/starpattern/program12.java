import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    int i,j,k=1,s;
    for(i = 1; i <= 4; i++)
    {
      k=i;
    for(j = 1; j <= 7; j++)
    {
      if(j >= 5-i && j <= 3 + i)
      {
        System.out.printf("%d",k);
        s = j < 4?k++:k--;


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
