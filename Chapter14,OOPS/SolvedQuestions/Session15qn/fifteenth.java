

public class fifteenth {
    public static void main(String[] args) {
        Base base = new Derived("Hello");
    }
}

class Base{
    public Base(){
        System.out.print("Base");
    }
    public Base(String s){
        System.out.println("Base:"+s);
    }
}

class Derived extends Base{
    public Derived(String s){
        super() ; // Stml -1 // parent class cunstructor can inly be called from first class of child class cunstructor ******
     //  super(s); //Stml -2    ************************* 
        System.out.println("Derived");

    }
}
/*  TO MAKE THIS PROGRAM RUN WE SHOULD REMOVE INE OF ITS SUPER CUNSTRUCOTR , HERE WE WILL REMOVE "super()", AS THE OBJECT FORMED EXPECTS 
   EXPECTS CUNSTRUCTOR WITH PARAMETER */
