import java.util.Scanner;
 public class Main{
  public static void main(String[]args){
    float degree , farenhieght=0;

    java.util.Scanner sc = new Scanner(System.in);

    System.out.println("enter temo in degrees");
    degree = sc.nextFloat(); 

    System.out.println("farenhieght is");
    farenhieght = degree*33.8f;
    System.out.println(farenhieght);
   }

}

