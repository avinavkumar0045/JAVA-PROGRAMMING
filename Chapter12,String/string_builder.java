public class string_builder { // class ka naam StringBuilder (or) stringbuilder nahi do
    public static void main(String[] args) { // time complexity = o(26)
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a';ch<= 'z';ch++){
            sb.append(ch+" ");
        } // abcdef....
        System.out.println(sb);

    }
    
}
// for(int j = 0;j<n;j++){
//     if(j < n-1 && j >0){
//         int pdt1 = 1;
//         int pdt2 = 1;
//         for(int i =0;i<j;i++){ 
//             pdt1 *= nums[i];
//         }
//         for(int i =j+1;i<n;i++){
//             pdt2 *= nums[i];
//         }
//         arr2[j] = pdt1 * pdt2;
        
//     }else if( j == 0){
//         int pdt2 =1;
//         for(int i = 1;i<n;i++){
//             pdt2 *= nums[i] ;
//         }
//         arr2[j] = pdt2;
//     }else {
//         int pdt1 =1;
//         for(int i = 0;i<n-1;i++){
//             pdt1 *= nums[i] ;
//         }
//         arr2[j] = pdt1;
//     }
// }
// return arr2;