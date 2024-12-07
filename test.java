 class Laptop {

    String name;
    int price;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    
}


public class test {
    public static void main(String[] args) {
        Laptop ob1 = new Laptop();
        Laptop ob2 = new Laptop();
        ob1.name = "Dell";
        ob1.price = 50000;
        ob2.name = "Dell";
        ob2.price = 50000;
        System.out.println(ob1==ob2);
        System.out.println(ob1.equals(ob2));
        // System.out.println(ob1.hashCode());
        // System.out.println(ob2.hashCode());
    }
}
