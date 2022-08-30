import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input a 3 digit number:");
       int n=input.nextInt();
        int r,ans=0,sum=0,c;
        while (n>0) {
            r=n%10;
            n=n/10;
            c=r*r*r;
            sum=sum+r*r*r;
        }
        if (sum==n) {
            System.out.println("Yes");
        } else {
            System.out.println("no");
        }
    
    }
}
