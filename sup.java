class a{
    public a(){
        super();
        System.out.println("inside a");
    }
    public a(int a){
        super();
        System.out.println("inside a int");
    }
}

class b extends a{
    public b(){
        super();
        System.out.println("inside b");
    }
}

public class sup{
    public static void main(String[] args) {
        b B=new b();
    }
}
