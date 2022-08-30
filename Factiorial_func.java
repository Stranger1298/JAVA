import java.util.Scanner;

public class Factiorial_func {
    public static void FindFactorial(int n) {
        int factorial=1;
        for(int i=n  ;i>=1 ; i--) {
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;

     }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        FindFactorial(n);
    }
}
