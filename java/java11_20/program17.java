import java.util.Scanner;

class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a>b)
    {
      System.out.println(" a is grearter");
    }
    else if(a==b)
    {
      System.out.println("both are equal");
    }
    else
    {
      System.out.println("a is lesser and b is greater num");
    }
  

  }

}


