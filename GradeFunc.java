import java.util.Scanner;

public class GradeFunc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int n=input.nextInt();
        grade(n);
    }
    public static void grade(int n) {
        if (n<=40) {
            System.out.println("Grade = Fail");
        }
        if (n>=41 && n<=50) {
            System.out.println("Grade = DD");
        }
        if (n>=51 && n<=60) {
            System.out.println("Grade = CD");
        }
        if (n>=61 && n<=70) {
            System.out.println("Grade = BC");
        }
        if (n>=71 && n<=80) {
            System.out.println("Grade = BB");
        }
        if (n>=81 && n<=90) {
            System.out.println("Grade = AB");
        }
        if (n>=91 && n<=100) {
            System.out.println("Grade = AA");
        }
        if (n>100 || n<0) {
            System.out.println("Invalid marks !! Please enter the valid marks.");
        }
    }
}
