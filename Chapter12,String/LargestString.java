public class LargestString { // we are here considering upper and lower case same
     public static void main(String[] args) { // time complexity = O(x* n)
        String fruits[] ={"Apple" , "Watermelon", "Orange","Guava"};
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i]) < 0){ // It means largest < fruits[i]
              largest =fruits[i]; // on the besis of dexicographic

            }
        }
        System.out.println(largest);

     }
}
