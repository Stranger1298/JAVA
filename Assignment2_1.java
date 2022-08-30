import java.util.Scanner;

public class Assignment2_1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int num=input.nextInt();
   if (num%2==0) {
            System.out.println("Number is even");
   }
   else {
            System.out.println("Number is odd");
   }
        }
    }
}
