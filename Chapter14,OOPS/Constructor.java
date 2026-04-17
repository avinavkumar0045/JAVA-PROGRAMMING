// Shallow Copy -> We copy the reference , so changes reflect in previous one
// Deep Copy -> We copy the object, so changes  DONT REFLECT in previous one 
public class Constructor {
    public static void main(String[] args) {
        //2A
        Student s1 = new Student(); // No need to define ,it will be called automatically ,it will recognise on the basis of arguments // #
        //2B
       // Student s2 = new Student("Avinav"); // @
       // Student s3 = new Student(123); // !
       // Student s4 = new Student("Avianav",123); // will not be called as, no such cunstructor exists
       s1.name ="Avinav";
       s1.roll = 56;
       s1.Password = "3434";
       s1.marks[0] = 34;
       s1.marks[1] = 45;
       s1.marks[2] = 21;
       //3
       Student s2 = new Student(s1); // Copy Constructor , s1 ki prop. ko s2 mein copy kiya , aur jo change krna tha usko bass kr denge 
       s2.Password = "#45";
       s1.marks[1] = 100; // humne ek change kiya
       for (int i=0; i<3;i++){
        System.out.println(s2.marks[i]);
       }
    }   
}
//1
class Student{
    String name;
    int roll;
    String Password;
    int marks[]; // array
    //3
    //  Shallow Copy constructor  ,s1 ki properties ko s2 mein copy kiya
   /*   Student (Student s1){ $ // name and roll copy kr liya , aus password naya bana liyaNT ALONE // COPIED BY THIS STATEMENT ALONE
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks =s1.marks; //****  only  reference of marks [] array  copied, not depp copy *****
    }  */

    // Deeep copy Constructor
    Student (Student s1){ //$ -> constructor has same name as class or struccture
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks =s1.marks;
        for ( int i=0;i<marks.length;i++){ 
            this.marks[i] = s1.marks[i]; // here we done the deep copy
        }
    } 
     //2A -> Non-Parameterised
    Student() { // #
        marks = new int[3];
        System.out.println("The constructor is called");
    }
    //2B -> Parameterised
    Student(String name){ //constructor is formed ,  // @ , now this will be called while creating objet in main class
        marks = new int[3];
        this.name = name;
    } 
    Student(int roll){ // !
        marks = new int[3];
        this.roll = roll;
    }
}
