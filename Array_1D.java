import java.util.Arrays;
import java.util.Scanner;
public class Array_1D {
    public static void main(String[] args) {
        // int[] num=new int[]{4,5,84,62};
        //another method:
        //int[] num= {4,5,84,62};
        // System.out.println("The length of array is:" + num.length);
        // int[] num=new int[4];
       
        // for (int i = 0; i < num.length; i++) {
        //     //System.out.println("Element at index " + i + " is " + num[i]);  
            
        // }
        //another method:
        // System.out.println(Arrays.toString(num));

        //TAKING ARRAY INPUT FROM USER
        // Scanner input=new Scanner(System.in);
        // int var=input.nextInt();
        // int[] arr=new int[var];
        // //INPUT
        //     for (int i = 0; i < var; i++) {
        //         arr[i]=input.nextInt();
        //     }
        // //OUTPUT
        //     for (int i = 0; i < var; i++) {
        //         System.out.println(arr[i]);
        //     }

        //APNI_KAKSHA HOMEWORK QUESTIONS
        // Scanner inp=new Scanner(System.in);
        // int size=inp.nextInt();
        // String[] str=new String[size];
        //  //taking input
        //  for (int i = 0; i < size; i++) {
        //     str[i]=inp.next();

        //  }
          //giving output
            // for (int j = 0; j < str.length; j++) {
            //     System.out.println("Your name is: " + str[j]);
            // }

            //APNI KAKSHA ASSIGNMENT QUESTION 3
                // Scanner input=new Scanner(System.in);
                // System.out.println("Enter the size of array: ");
                // int size=input.nextInt();
                int[] var={45,5,6,7};

                // for (int i = 0; i < var.length; i++) {
                //     var[i]=input.nextInt();
                // }

                 for (int i = 0; i < var.length; i++) {
                    if (var[0]<var[1] && var[1]<var[2] && var[2]<var[3]) {
                        System.out.println("Yes it is in ascending order");
                    }
                    else {
                        System.out.println("No it is not in ascending order");
                    }
                }

        }
}
