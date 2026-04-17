public class Inheritence {
    public static void main(String[] args) {
       

        Dog dobby = new Animal();
        dobby.eat();
        dobby.legs = 4;
        System.out.println("Dobby has "+dobby.legs+" legs");
    } 
}
// Base class
class Animal{
    String color;

    void eat() {
        System.out.println("eats");
    }
    
    void breathe(){
        System.out.println("Breathes");
    }
}
// Derived class
class Mammal extends Animal {
    int legs ;
    
}
// Derived class
class Dog extends Mammal {
    String Breed;
}
class Bird extends Mammal {
    void fly() {
        System.out.println("Flies");
    }
}
