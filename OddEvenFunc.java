import java.util.Scanner;

public class OddEvenFunc {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        voteAge(a);
    }
    public static void voteAge(int a) {
    while (a>0) {
        if (a>=18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible to vote");
        }
        break;
    }
        
    }
}
