
public class AbstractClass {

    public static void main(String args[]) {
        //5
        Horse charlie = new Horse();
        charlie.walk();
        charlie.eat();
      
        //********************** 
       // Animal duck = new Animal(); // Gives error as Cannot instatiate object of Astract class
       //7  
       System.out.println(charlie.color); // the color will always be brown until we change the color 
                            // "brown" cause sabse phele uske super class ka cunstructor call hota hai

    }
    
}
//1
abstract class Animal{ // Abstract class

    //6 ---------------
    String color;
    Animal() {
        System.out.println("Animal Cunstructor called");
        color = "Brown";
    }


    void eat(){ // Non-Abstract Object
        System.out.println("Eats anything");
    }

  /*   abstract void walk(){ // Abstract Object
        System.out.println("Walks using legs");
    } */

    abstract void walk(); // Abstract mwthods are those in which we dont write their workings
}
//2
class Horse extends Animal {

    Horse(){
        System.out.println("Horse Cunstructor Called");
    }

    void changecolor(){ //
        color = "dark brown";
    }
    void walk(){  // Here defining the walk(Abstract) method in child class
        System.out.println("Walks on 4 legs");
    }
}
//3
class Chicken extends Animal {
    void walk(){
        System.out.println("Walks in 2 legs");
    }
}
