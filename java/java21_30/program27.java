import java.util.Scanner;


class Main{
  public static void main(String[]args){
    System.out.println("enter a  number how much ood number u want ");
    Scanner sc = new Scanner(System.in);
    int i , x = sc.nextInt(),O;
    for (i = x; 1 <= i; i-- )
    {
        O = 2*i-1;
        System.out.println(O);
    }
  }
}


