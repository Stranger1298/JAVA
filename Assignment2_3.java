import java.util.Scanner;

public class Assignment2_3 {
    public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
        System.out.println("Enter the Principle,Rate and Time");
        
    float P=input.nextInt();
    float R=input.nextShort();
    float T=input.nextInt();
    Float SI=(P*R*T)/100;
        System.out.println("SI value is: " + SI);
    }
        
    }
}
