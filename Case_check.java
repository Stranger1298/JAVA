import java.util.Scanner;

public class Case_check {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            char ch=input.next().trim().charAt(0);
            if (ch>='a' && ch<= 'b') {
                System.out.println("Smaller case");
            }
            else {
                System.out.println("Lower case");
            }
        }

    }
}
