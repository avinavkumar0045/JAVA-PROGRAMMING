import java.util.ArrayList;

public class Monotonous {
    public static Boolean IsMonotonous(ArrayList<Integer> list){
        for(int i =0; i<list.size()-1;i++){
            if(list.get(i+1) < list.get(i)){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
       
        System.out.println(IsMonotonous(list));

    }
    
}
