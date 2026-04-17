
import java.util.*;
public class ShortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        int y=0,x=0;
        for(int i=0;i<path.length();i++){
           
            if(path.charAt(i) == 'N'){
                y++;
            }
            else if(path.charAt(i) == 'S'){
                y--;
            }else if(path.charAt(i) == 'E'){
                x++;
            }else {
                x--;
            }
        }
            System.out.println("The X coordinate is :"+ x);
            System.out.println("THe Y coordinate is :"+ y);
            int X2 = x*x; // x square
            int Y2 = y*y;

            System.out.println("the sortest path is : "+ Math.sqrt (X2 + Y2));


        
    }
    
}
