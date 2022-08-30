import java.util.Scanner;

public class Sum_func {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a=input.nextInt();
        System.out.println(sum(a));
        
    }
    public static int sum(int a) {
        int sum=0;
        for (int i = 1; i <= a; i++) {
            sum+=i;
        }
        return sum;
    }
}
