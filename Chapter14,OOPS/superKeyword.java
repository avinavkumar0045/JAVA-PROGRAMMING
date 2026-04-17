public class superKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println("The color of the horse is " + h.color);  
        
    }
    
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal Cunstructor is called");

    }
}

class Horse extends Animal{
    
    Horse(){
        super(); // Used to refer immediated class (parent )prop. , fxns , cunstructor. 
 // ***** Parent clss cunstructor can only be called from the first line of the child class  cunstructor eg. super , in this program
        System.out.println("Horse cunstructor is called"); 
        super.color = "BROWN"; // Sets the value for above feather of , // accessing properties
    }
}
