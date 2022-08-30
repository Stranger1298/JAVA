import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter two numbers");
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int hcf=1;
            for(int i=1;i<=a;i++)  {
                if (a%i==0 && b%i==0) {
                    hcf=i;
                }
                System.out.println("HCF is:" +hcf);
            }
        }


    }
}
