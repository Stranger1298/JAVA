import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
         try (//LEAP YEAR CHECKER
   Scanner input = new Scanner(System.in)) {
      System.out.println("Enter the year:");

       int in=input.nextInt();
      
 if (in % 400 == 0) {
       System.out.println("This year is a leap year");
 }
 else if (in % 100 ==0) {
       System.out.println("This year is not a leap year");
 }
 else if (in % 4 ==0) {
       System.out.println("This year is  a leap year");
 } else {
       System.out.println("This year is not a leap year");
 }
   }
    }
   

}
