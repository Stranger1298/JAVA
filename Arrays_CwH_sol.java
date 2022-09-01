import java.util.Scanner;

public class Arrays_CwH_sol {
// Question--1
    // public static void main(String[] args) {
    //     float[] num={1.5f , 2.5f , 5.0f , 7.5f , 8f};
    //     float sum=(num[0] + num[1] + num[2] + num[3] + num[4]);
    //     System.out.println(sum);
    // } 

// Question--2
        // public static void main(String[] args) {
        //     Scanner input=new Scanner(System.in);
        //     System.out.print("Enter the number : ");
        //     int n=input.nextInt();
        //     int arr[]={2,4,6,8,7};
        //     boolean isInArray=false;
        //     for(int element:arr) {
        //         if(n==element) {
        //             isInArray=true;
        //             break;
        //         }
        //     }
        //     if(isInArray) {
        //         System.out.println("Yes it is in the Array");
        //     }
        //     else{
        //         System.out.println("No it is not in the Array");
        //     }
        // }

// Question--3
            // public static void main(String[] args) {
            //     int[] marks={55,65,78,47,39};
            //     int average=0;
            //     for(int element:marks) {
            //          average=average+element;
            //     }
            //     System.out.println("The average marks is " + average/marks.length);
            // }

// Question--4
                // public static void main(String[] args) {
                //     int[][] mat1={{1,2,3} , {4,5,6}};
                //     int[][] mat2={{4,5,6} , {1,2,3}};
                //     int[][] result={{0,0,0} , {0,0,0}};
                //     for(int element:mat1[0]) {
                //         for(int element2:mat2[0]) {
//WILL DO THIS AFTER LEARNING STRING FORMATTING
                //         }
                //     }
                // }
// Question--5
                    // public static void main(String[] args) {
                    //     int[] arr={1,2,3,4,5,7,8};
                    //     for (int i = arr.length-1; i <arr.length; i--) {
                    //         System.out.print(arr[i]);
                    //         System.out.println("");   
                    //     }
                    // }
// Question=--6
                        public static void main(String[] args) {
                            int[] arr={5,6,2,7,8};
                            // int max=Integer.MIN_VALUE;
                            int max=0;
                            for (int element:arr) {
                                if (element>max) {
                                    max=element;
                                }  
                            }
                            System.out.println(max); 
                        }

    }
