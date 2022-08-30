import java.util.Scanner;

import javax.xml.transform.Source;

public class Max_Min_Array {
    public static void main(String[] args) {
        // int[] var=new int[4];
        // Scanner inp =new Scanner(System.in);
        
        // for (int i = 0; i < 4; i++) {
        //     var[i]=inp.nextInt();
        // }
        //     int max=Integer.MAX_VALUE;
        //     int min=Integer.MIN_VALUE;
        // for (int i = 0; i < 4; i++) {
        //     if (var[i]<min) {
        //         min=var[i];
        //     }
        //     if (var[i]>max) {
        //         max=var[i];
        //     }
        // }

                           /*or */
        // int[] var={1,2,3,4,5,6};
        // int max=Integer.MAX_VALUE;
        // int min=Integer.MIN_VALUE;
        // for (int i = 0; i < var.length; i++) {
        //     if (var[i]>max) {
        //         max=var[i];
        //     }
        //     if (var[i]<min) {
        //         min=var[i];
        //     }
        // }

                //another one
        // int[] var={100,2,3,4};
        // int max=var[0];
        // int min=var[0];
        // for (int i = 0; i < var.length; i++) {
        //     if (var[i]>max) {
        //         max=var[i];
        //     }
        //     if (var[i]<min) {
        //         min=var[i];
        //     }
        // }
        // System.out.println("The maximun value is : " + max);
        // System.out.println("The minimun value is : " + min);

                      //ANOTHER METHOD
            Scanner input=new Scanner(System.in);
            System.out.println("Enter first number : ");
            int first_num=input.nextInt();
            System.out.println("Enter second number : ");
            int second_num=input.nextInt();
            System.out.println("Enter third number : ");
            int third_num=input.nextInt();
            int max=first_num;

            if (second_num>first_num) {
                max=second_num;
            }
            else {
                max=first_num;
            }
            if (third_num>second_num) {
                max=third_num;
            }
            else {
                max=second_num;
            }
            System.out.println("The maximun numbers amoung " + first_num + " "+ second_num +" " + third_num +" " + "is" + " " + max);


    }
}
