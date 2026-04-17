

/* 
Create a program to take input marks of students in 3 subjects physics, chemistry, and maths.
 Compute the percentage and then calculate the grade  as per the following guidelines 

Hint => 
Take input for the number of students
Create arrays to store marks, percentages, and grades of the students
Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
Calculate the percentage and grade of the students based on the percentage
Display the marks, percentages, and grades of each student */
public class WaterFourteen {
    public static void main(String[] args) {
        int n = 3;
        int[] s1 = {2,3,4};
        int[] s2 = {4,5,6};
        int[] s3 = {3,4,1};

        int perc[] = new int[3];
        char grades[] = new char[3];
        int sum1 = 0;int  sum2 = 0; int sum3= 0;
        for(int i = 0;i<3;i++){
            sum1 += s1[i];
            sum2 += s2[i];
            sum3 += s3[i];
        }
        perc[0] = (sum1 / 30) * 100 ;
        perc[1] = (sum2 /30) * 100;;
        perc[2] = (sum3 / 30) * 100;
        
        for(int i = 0;i<3;i++){
            if(perc[i] > 90 ){
                grades[i] = 'A';
            }else{
                grades[i] = 'B' ;
            }
        }
        
        for(int i = 0;i<3;i++){
            System.out.println(grades[i]);
        }
    }
}
