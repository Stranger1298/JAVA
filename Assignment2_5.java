import java.util.Scanner;

public class Assignment2_5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter two numbers");
            int num1=input.nextInt();
            int num2=input.nextInt();
            if (num1>num2) {
                System.out.println(num1 + " is greater");
            }
            else {
                System.out.println(num2 + " is greater");
            }
        }
    }
}
