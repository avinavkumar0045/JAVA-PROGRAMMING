//  Write a program that implements method overloading for area calculation (circle,rectangle, triangle).
public class WaterEight {

    void area(int r){
        System.out.println("The area of the circle is : "+ 3.14*r*r);
    }
    void area(int len , int wid){
        System.out.println("The are of the rectangle is : "+ (len * wid));
    }
    void area(double base , double height){
        System.out.println("The area of the triangle is : "+( 0.5 * base * height));
    }
    public static void main(String[] args) {
       WaterEight ar  = new WaterEight();
       ar.area(3);
       ar.area(3,4);
       ar.area(2,2); 
    }
}
