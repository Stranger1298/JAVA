public a{
    public void show(){
        System.out.print("in show");
    }
}


public class Anoclass {
    public static void main(String[] a) {
        a ob1=new a(){
        public void show(){
            System.out.print("in new show");
        }
        };    
        ob1.show(); 
    }
}