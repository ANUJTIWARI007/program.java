import java.util.Scanner;

class Main{
  public static void main(String[]args){
    System.out.println("enter your cgpa accoring to subjects");
     
     Scanner marks = new Scanner(System.in);
     System.out.println("enter you maths cgpa");
     float maths = marks.nextFloat();
     System.out.println("enter your hindi cgpa");
     float hindi = marks.nextFloat();
     System.out.println("enter your english cgpa");
     float english = marks.nextFloat();
     System.out.println("enter your sst cgpa");
     float sst = marks.nextFloat();
     System.out.println("enter your science cgpa");
     float science = marks.nextFloat();
     
     float sum = maths + science + english + hindi + sst;
     System.out.println("total cgpa");
     float total = sum/5;
     System.out.println(sum);
     System.out.println("your percentage is");
     System.out.println(total*9.5);

  }
}
