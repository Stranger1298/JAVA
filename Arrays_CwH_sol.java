import java.util.Scanner;

public class Arrays_CwH_sol {
// Question--1
    // public static void main(String[] args) {
    //     float[] num={1.5f , 2.5f , 5.0f , 7.5f , 8f};
    //     float sum=(num[0] + num[1] + num[2] + num[3] + num[4]);
    //     System.out.println(sum);
    // } 

// Question--2
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the number : ");
            int n=input.nextInt();
            int arr[]={2,4,6,8,7};
            boolean isInArray=false;
            for(int element:arr) {
                if(n==element) {
                    isInArray=true;
                    break;
                }
            }
            if(isInArray) {
                System.out.println("Yes it is in the Array");
            }
            else{
                System.out.println("No it is not in the Array");
            }
        }
    }
