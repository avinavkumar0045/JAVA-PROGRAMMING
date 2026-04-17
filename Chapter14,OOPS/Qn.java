public class Qn {
    public static void main(String[] args) {
       GreenCar  C = new GreenCar();
        
    }
    
}

abstract class Car{
    static{
        System.out.println("1");
    }

    public Car (String name){
        super();
        System.out.println("2");
    }

    {
        System.out.println("3");
    }

}

public class GreenCar extends Car {
    {
        System.out.println("4");
    }

    public GreenCar(){
        super("blue");
        System.out.println("5");
    }

    
    
}
