import java.util.*; // MAXIMUM ACTIVITY SELECTION QUESTION , VERY IMPORTANT , BAHUT JAGAH USE HOGA YE CONCEPT
 // 🌟🌟🌟🌟✨✨✨🙃🙃
public class firstActivitySelection {
    public static void main(String args[]){
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};  // Here the ending time array is sorted.

        // Let suppose the endtime array given was not sorted 

        int activities [][] = new int[start.length][3];
        for(int i =0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i]; 
        }

        // lamda function -> shortform 🩷🩷🩷🩷
        Arrays.sort(activities , Comparator.comparingDouble(o-> o[2])); // o[2] se we are defing the term which will the basis of sorting 
                                                                        // sorting on the basis of 2nd column
       
        int maxAct = 0; // for counting acts

        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(activities[0][0]); // initiallly starting with first activity
        int lastEnd = activities[0][2]; // as we are performing sorting on basis of end point . 

        for(int i =1; i< end.length; i++){
            if(activities[i][1] >= lastEnd){ // checking condition
                maxAct++; // increasing the cpunt of number of counts
                ans.add(activities[i][0]); // updating the data for new use
                lastEnd = activities[i][1];

            }
        }

        System.out.println("Maximum activity done is :"+ maxAct);
        for(int i =0; i<ans.size();i++){
            System.out.print("A" + ans.get(i)+" "); // A represents Activity

        }
        System.out.println();

    }
    
}
