import java.util.Scanner;
 public class Main{
  public static void main(String[]args){
    int lenth , breath , height , volume;
    java.util.Scanner sc = new Scanner(System.in);

    System.out.println("enter lenth");
    lenth = sc.nextInt();

    System.out.println("enter breath");
    breath = sc.nextInt();

    System.out.println("enter height");
    height = sc.nextInt();
    
    System.out.println("volume is");
    volume = lenth*breath*height;
    System.out.println(volume);

    
   
   
   
   
   }

}
