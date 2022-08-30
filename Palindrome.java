import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n=input.nextInt();
            int p=n;
            int r,c=0;
        while (n>0) {
            r=n%10;
            c=(c*10)+r;
            n=n/10;

        }
        if (c==p) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

            
            
        }
        
    }
}
