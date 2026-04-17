public class NumberPyramid {
    public static void main(String[] args) { // Also in notes of javayoutube(chapter 6)
        int x = 5;
        for(int i=1; i<= x; i++){
            for(int j=1; j<=x; j++){
                if((i+ j )<= x){ //LHS ka space print kara do, baaki jagah (star + space)
                    System.out.print(" ");
                }else{
                    System.out.print(i +" ");// baaki jagah (star + space)
                }
            }
            System.out.println();
        }
    }
    
}
