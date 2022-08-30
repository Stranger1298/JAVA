import java.util.Scanner;
public class Plain{

    public static void main(String[] args) {
        //System.out.println("hey");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt(); 
        int b=input.nextInt();  
        int c=input.nextInt();

        int max=a;
        if(b>a) {
            max=b;
        }
        if(c>b) {
            max=c;
        }
    System.out.print( "The maximum amoung these is" + max); 
    }
}