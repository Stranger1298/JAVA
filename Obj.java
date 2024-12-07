class Car {
    private int price;
    private String clr;
    String wheel;

        public Car(){
            this.price=200;
            this.clr="Black";
        }
    // public String color() {
    //     clr="Red";
    //     return clr;
    // }

    // public int price() {
    //     price = 99999;
    //     return price;
    // }

    public String wheels() {
        wheel="Alloy";
        return wheel;
    }
}

public class Obj {

    public static void main(String[] args) {
        Car car = new Car();
        // int price = car.price();
        // System.out.println(price);

        // String color = car.color();
        // System.out.println(color);

        String wheel = car.wheels();
        System.out.println(wheel);
    }
}
