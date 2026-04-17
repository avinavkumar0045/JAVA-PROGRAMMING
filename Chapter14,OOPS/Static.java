

public class Static {
    public static void main(String[] args) { // programmer wants to have only one main class for a program
        Student s1 = new Student();
        s1.name = "Avj ";
        s1.SchoolName = "SRM";

        Student s2 = new Student(); // created differnt object
        s2.name  = "chef";
        System.out.println(s2.SchoolName); // this will also show the same name , as school name is static

        
        
    }
    
}

class Student{
    String name;
    int roll;

    static String SchoolName; // static hence, will be same for all 

    static int  returntotal (int phy, int math, int che){  // hence marks of subs. maybe diff for students , but logic for total will be same
        int total = phy + che + math ;
        return total;

    }


    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;

    }
 }

 



