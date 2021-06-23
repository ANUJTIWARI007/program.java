import java.util.Scanner;


class Main{
  public static void main(String[]args){
    System.out.println("enter a number ");
    Scanner sc = new Scanner(System.in);

    int i,x = sc.nextInt(); 

    for(i = x; i >= 1; i--)
    {
      System.out.println(i);
    }
  }
}


