import java.util.Arrays;// 🌟🌟🌟💫💫💫
import java.util.Comparator;

// You have to pay price for each cuts , so make expensive cuts early , causes pieces increase when chocolate is cut.
public class sevenChocolaProblem { //🩷🩷🩷🩷This problem is available on SPOJ platform 
    public static void main(String args[]){
        int n =4; int m = 6;
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = { 4,1,2};

        int  h =0; int v = 0; // these are the horizontal , vertical cuts which I am going to apply now 
        int hp =1; int vp =1; // intitially horizontal and vertical pieces are 1 and 1 .
        int cost = 0;

        Arrays.sort(costVer , Comparator.reverseOrder());
        Arrays.sort(costHor , Comparator.reverseOrder());

        while(h < costHor.length && v<costVer.length){
            // vertical cost <= horizontal cut
            if(costVer[v] <= costHor[h]){ // here applying horizontal cut , as it it expensive
                cost += costHor[h] * vp;
                hp++; // hp increases 
                h++;


            }else{ // vertical cost > horizonatal cost
                cost += costVer[v] * hp;
                vp++;
                v++;

            }

        }
        // now applying the cuts which are left over 
        while(h < costHor.length){
            cost += costHor[h] * vp;
                hp++; // hp increases 
                h++;

        }while(v < costVer.length){
            cost += costVer[v] * hp;
            vp++;
            v++;
        }
        System.out.println("Minimum price paid for "+  n * m + " pieces is :"+ cost);

    }
    
}
