

public class Polymorphism {
    public static void main(String[] args) {
        Calculator Calc = new Calculator();

        System.out.println(Calc.sum(5,4)); // self idetifies 
        System.out.println(Calc.sum(1,0,6)); 
        System.out.println(Calc.sum((float)5.1,(float)4.2)); // type cast

        Deer lali = new Deer();
            lali.eats();  
    }
}
// Function Overridding
    class Animal {
        void eats(){
            System.out.println("Eats Anything");
        }
    }
    class Deer extends Animal {
        @Override // nahi bhi likhne se wo khud hi override kr dega
        void eats(){
            System.out.println("Eats Grass");
        }
    }
 // Function Overloading
    class Calculator {
        int sum(int a , int b){
            return a+b ;
        }
        float sum(float c, float d){
            return c + d;
        } 
        int sum ( int a, int b, int c){
            return a+b+c;
        }
    }
    

