import java.util.Scanner;

public class Assignemnt2_6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Type the rupee value:");
            float Rupee=input.nextFloat();
            float USD=(float) (Rupee * 0.013);
            System.out.println("The USD value is " +USD);
        }
    }
}
