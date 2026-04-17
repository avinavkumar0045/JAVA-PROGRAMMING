public class abdc {
    public static void main(String[] args) {
       GreenCar C = new GreenCar();
        
    }
    
}
abstract class Car{
    static{
        System.out.print("1");
    }

    public Car (String name){
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }

}

public class GreenCar extends Car {
    {
        System.out.print("4");
    }

    public GreenCar(){
        super("blue");
        System.out.print("5");
    }

    
    
}
