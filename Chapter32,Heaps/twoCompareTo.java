
import java.util.*;
public class twoCompareTo {
    static class Student implements Comparable<Student>{ // overriding
        int rank;
        String name;
        public Student (String name , int rank){
            this.rank = rank;
            this.name = name;
        }
        @Override
        public int compareTo(Student s2){
            return (this.rank - s2.rank);
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(); 
        pq.add(new Student("Avi",45));
        pq.add(new Student("Ram" , 1));
        pq.add(new Student("Shiv",2));
        pq.add(new Student("hanumanta ",3));

        while( !pq.isEmpty()){
            System.out.println(pq.peek().name+"-->"+pq.peek().rank);
           pq.remove();
        }
    } 
}


