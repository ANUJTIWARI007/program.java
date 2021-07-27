import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number of rows");
    int rows = sc.nextInt();
    int i,j,k=0,s;
    for(i = 1; i <= rows; i++)
    {
     s = i <= (rows+1)/2?k++:k--;
    for(j = 1; j <= rows; j++)
    {
      if(j >= 5 - k && j <= 3 + k)
      {
       System.out.print("*");
      }
      else
      {
        System.out.printf(" ");
      }
    }
     System.out.print("\n");
   }
  }
}
