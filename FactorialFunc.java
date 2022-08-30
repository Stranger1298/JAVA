import java.util.Scanner;

public class FactorialFunc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
            factorial(a);
    }

    public static void factorial(int a) {
        int Factorial=1;
        for (int i = a; i >=1 ; i--) {
            Factorial=Factorial*i;
        }
        System.out.println(Factorial);
        return;
    }
}
