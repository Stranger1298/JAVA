import java.util.Scanner;

public class PrimeFunc {
    // public static void main(String[] args) {
    //     Scanner input=new Scanner(System.in);
    //     System.out.print("Enter the number :");
    //     int a=input.nextInt();
    //     prime_checker(a);
    // }
    // public static void prime_checker(int a) {
    //     for (int i = 2; i < a; i++) {
    //         if (a%i==0) {
    //             System.out.println("Not a Prime number");
    //         } else {
    //             System.out.println("prime number");
    //         }
    //         return;
    //     }
    // }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a=input.nextInt();
        int b=input.nextInt();
        prime(a, b);
    }
    public static void prime(int a , int b) {
        for (int i = a; i <=b; i++) {
            boolean flag=true;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    flag=false;
                }
            }
            
            } 
            
        }
        
    }

