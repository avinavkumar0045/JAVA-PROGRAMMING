/* 
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends */


public class WaterTwelve {
    public static void main(String[] args) {
        int[] height = { 12,15,14};
        int[] age = { 18,14,16};

        for(int i = 0;i< 3-1;i++){
            if(height[i] > height[i+1]){
               int temp =  height[i] ;
               height[i] = height[i+1];
               height[i+1] = temp;
            }
            if(age[i] > age[i+1]){
                int temp =  age[i] ;
                age[i] = age[i+1];
                age[i+1] = temp;
             }
        }
        System.out.println(height[2]);
        System.out.println(age[2]);
    }
    
}
