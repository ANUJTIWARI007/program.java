import java.util.Scanner;


class Main{
  public static void main(String[]args){
    System.out.println("enter a  number how much even u want ");
    Scanner sc = new Scanner(System.in);
    int i , x = sc.nextInt(),E;
    for (i = 1; i <= x; i++ )
    {
        E = 2*i;
        System.out.println(E);
    }
  }
}


