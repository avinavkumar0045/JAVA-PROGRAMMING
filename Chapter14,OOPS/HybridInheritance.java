public class HybridInheritance {
    public static void main(String args[]){
       Human child = new Human ();
        child.eat();
        System.out.println(child.legs);
    }
}
class Animal {
    void eat (){
        System.out.println("Eats to live");
    }
    void breathe (){
        System.out.println("breathes Air");
    }      
}
class Mammal extends Animal {
    void legs (){
        System.out.println("Have legs for locomotion");
    }
}
class Bird extends Animal {
    void wings(){
        System.out.println("Have wings to fly");
    }
}
class Fish extends Animal {
    void fins(){
        System.out.println("Have fins to swim");
    }
}
class Human extends Mammal {
    int legs = 2;
    void senses (){
        System.out.println("Has 6 senses");
    }  
}
class Dog extends Mammal {
    void speak(){
        System.out.println("barks ");
    }
}
class Shark extends Fish {
    void size (){
        System.out.println("Is big in size");
    }
}

