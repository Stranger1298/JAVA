import java.util.Scanner;

import javax.swing.InputMap;

public class Area {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //CIRCLE
        System.out.println("Enter the radius:");
        int r=input.nextInt();
        double area=(3.14*r*r);
        System.out.println("Area of circle is:"+ area);

        

        
    }
}
