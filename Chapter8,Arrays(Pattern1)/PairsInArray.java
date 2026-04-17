public class PairsInArray {  // DIMAG ******
    public static void main(String[] args) {// tp = n(n-1) / 2
        int marks[] = { 2,3,4,5,6};
        pairs(marks);
    }
    
    public static int pairs(int marks[]){ // O(n^2)
        int tp =0;
        for(int i=0; i<marks.length;i++){
            int curr = marks[i]; // 2,3,4,5,6
            for(int j=i+1; j<marks.length;j++){
                System.out.print("("+ curr + ","+marks[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are:" + tp);
        return 0;
    }
    
}
