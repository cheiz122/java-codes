package divisibility;
   import java.util.Scanner;


public class divisibility{
    public static void main(String[]args){
 Scanner Sc = new Scanner(System.in); 
    System.out.print("please input your number");
    int num=Sc.nextInt();
    if(num%3==0 && num%5==0)
      System.out.print("fizzbuzz") ;
      else if(num%3==0)
      System.out.println("fizz");
      else if(num%5==0)
      System.out.println("buzz");
      else
      System.out.println("try with 3,4,5,15,45,19");
}
  
    }
