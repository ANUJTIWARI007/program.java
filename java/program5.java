import java.util.Scanner;
class Main{
  public static void main(String[]args){
    System.out.println("enter your name");
    Scanner Name= new Scanner(System.in);
    String name = Name.next();
    System.out.print("\nhello ");
    System.out.println(name);
  }
}
