
public class Qn1 { // print then indices of repeated key
    public static void Occurences(int arr[],int i, int key){
        // base case
        if(i == arr.length  ){
            return;
        }
        // kaam
        if(arr[i] == key){
            System.out.print(i+" , ");
          //  Occurences( arr,i+1,  key); this will not be here, it will be wrong , Loop se bahar niklo ge to khud hi call ho gaya hai
        }
        Occurences(arr,i+1,key);

    }
    public static void main(String[] args) {
        int arr[] = { 1,2,4,3,2,6,2,5};
        int key = 2;
        System.out.println("The indices at which "+key+" is repeated are : ");
        Occurences(arr,0,key);
    }
    
}
