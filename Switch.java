import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String fruit=input.next();
        //if (fruit=="mango"|| fruit.equals("mango")) {
         //   System.out.println("King of fruits");
         switch (fruit) {
            case "mango":
                System.out.println("King of fruits");
                break;
                //if break is not used then it kept printing all the outputs till it ends.
         
            default:
                System.out.println("Please enter valid fruit");
                break;
         }
            
        }
    }

