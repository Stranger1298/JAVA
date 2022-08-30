import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Scanner input=new Scanner(System.in);
        // System.out.println("Enter the N");
        // int N=input.nextInt();
        // int first_num=0;
        // int second_num=1;
        // int next_num=first_num+second_num;
        //     while (N>first_num) {
        //         System.out.println("The fibonacci series of" + N + "is" + );
        //     }



        try (Scanner input = new Scanner(System.in)) {
            int n =input.nextInt();
            int a= 0;
            int b= 1;
            int count= 2;
            while (count <= n) {
                int temp  = b;
                b = b+a;
                a=temp;
                count++;
            
            }
            System.out.println(b);
        }

    }
}
