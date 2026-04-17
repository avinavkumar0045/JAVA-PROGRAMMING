import java.util.*; // check the notes and see the diagram
public class sevenInterleave {

    public static void Interleave(Queue<Integer> q){
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size ();  // calculate separately cause loop mein directly q ko hi reduce kr rahe hai, so it will give error

        for(int i =0; i<size / 2; i++){
            firstHalf.add(q.remove());

        }
        while (!firstHalf.isEmpty() ){
            q.add(firstHalf.remove()); // first half se element nikal kr , q mein dala 
            q.add(q.remove()); // fir q ke aage se element nikal ke peeche se q mein daala

        }

    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        Interleave(q);

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        System.out.println();
        



    }
    
}
