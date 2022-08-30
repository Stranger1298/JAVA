import java.util.Scanner;

public class Calculator_Func {
   
//addition func
    public static int sum(int a , int b) {
        int add=a+b;
        return add;
    }
//subtraction func
    public static int subtract(int a , int b) {
        int subtract=a-b;
        return subtract;
    }
//multiply func
    public static int multiply(int a , int b) {
        int multiple=a*b;
        return multiple;
    }
//division func
    public static float division(float a , float b) {
        float divide=a/b;
        return divide;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Input two numbers : ");
        int a=input.nextInt();
        int b=input.nextInt();
        // System.out.println("Choose the operator: + - * / ");
        // String operator=input.next();
        
       int add=a+b;
       int subtract=a-b;
       int multiple=a*b;
       float divide=a/b;
       
        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiple);
        System.out.println(divide);
    } 
}
