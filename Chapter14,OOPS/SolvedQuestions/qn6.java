

public class qn6 {
    public static void main(String args[]){
        Vehicle obj1 = new Car();
        obj1.print12(); // Its an error , this is nor defined for vechicle class

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }

    
}

class Vehicle{
    void print(){
        System.out.println("Vehicle is called");
    }
    
}
class Car extends Vehicle{
    void print12(){
        System.out.println("Car is called");
    }
}
