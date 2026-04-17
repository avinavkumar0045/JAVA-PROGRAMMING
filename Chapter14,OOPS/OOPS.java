
public class OOPS {
    public static void main(String[] args) { //3
        Pen p1 = new Pen(); // created a pen object , isse phele neeche classes mein humne sirf blureprint banaya hai
        p1.setColour("Blue");
        System.out.println(p1.colour);
        p1.setTip(5);
        System.out.println("The tip is " + p1.tip);
        p1.colour= " yellow";
        System.out.println(p1.colour);
        // 4
        BankAccount myAcc = new BankAccount();
        myAcc.Username = "Avi45";
       // myAcc.Password = " 4545";  //if we write this line , this shows error , that its not visible(cause "Private" in Class)

       myAcc.setPassword("4545"); // So we are using this cause private 

    }
    
}
// 3
//Acess Modifiers
class BankAccount {
    public String Username; // visible to everyone
    private String Password ;// not visible outside class
    public void setPassword (String pwd){ // as this is within class, so we can call from here
        Password = pwd;
    }

}

//1
class Pen { // In this we will define all properties and function
    String colour; // 2 Qualities
    int tip;

    String  getcolour(){  // GETTERS , to return value
       return  this.colour; // here this means curr object
    }
    int gettip(){
        return this.tip;
    }

    void setColour(String newColour){ // Functions of pen  // SETTERS
        colour = newColour;

    }
    void setTip( int newTip ){ // SETTERS , to modify value
        tip = newTip;
    }

}

//2
class Student {

    String name;
    int age;
    float percentage;

    void calcPercentage ( int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }


}