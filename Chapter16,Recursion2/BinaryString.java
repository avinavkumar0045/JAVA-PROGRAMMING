// REDO PAKKA , CHECK THE STACK ANALYSIS VIDEO 🥵🥵🤯
public class BinaryString { // Print all binary strings of Size N without consecutive Ones.

    public static void Ways(int x, int lastPlace, String str){
        if( x == 0 ){
            System.out.println(str);
            return ;
        }

        // Kaam 
        Ways(x-1,0,str+"0"); //ye sirf , agle level ko lagega kursi pe 0  ko bithaya hai, par aisa nahi hai
        if(lastPlace == 0){
            Ways(x-1,0,str+"1"); // ye sirf , agle level ko lagega kursi pe 1  ko bithaya hai, par aisa nahi hai
            

        }
    }
    public static void main(String[] args) { 
        int BinarySize = 3; // Size in which we have to enter Binary units
        
        Ways(BinarySize,0, "");


        
    }
    
}
