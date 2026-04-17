
public class tenth {
    public static void main(String[] args) {
        Derived d  = new DeriDerived(); // sirf objct bnaaye hai , object banane se bhi call ho jata hai

    }
    
}
class Base{
    public Base(){
        System.out.println("base");
    }
}

class Derived extends Base{
    public Derived(){
        System.out.println("Derived");
    }
}
class DeriDerived extends Derived{
    public DeriDerived(){
        System.out.println("deriDerived");
    }
}
