public class try3 {
    public static long zeroFilledSubarray(int[] nums) {
        int i_count = 0;
        long l_output = 0;
        for(int count = 0;count<nums.length ;count++){
            if(nums[count] == 0){
                i_count++;
            }else{
                l_output += (i_count*(i_count + 1)) / 2;
                i_count = 0;
            }
        }
        l_output += (i_count*(i_count + 1)) / 2; // if the val at last index is '0'(case 2)
        return l_output ; 
    }

    public static void main(String args[]){
       String str = "ABCED";
       
        System.out.println(str);
    }
}