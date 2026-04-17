
public class StringCompression { // aaaabbcccd = a4b2c3d , if single time compression, dont write the number

    public static String Compression(String str){
        String newStr = "";
        for(int i=0;i<str.length(); i++){ // o(n), linear time complexity
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i); // ye kyu ki, eg., last 'c', ke liye while case galat ho jaiega, 
            if(count >1){ // agar count equal to 1 hai, to bass wahi print kara denge
                newStr += count.toString();
            }           
        }
        return newStr;
    }
    
    public static void main(String[] args) {
        String str = "aaaabbcccd";
        System.out.println(Compression(str));   
    }  
}
