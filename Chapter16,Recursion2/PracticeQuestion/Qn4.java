//We are given a string S, we need to find the count of ll contiguous substring starting and ending with the same character 

public class Qn4 {
    public static int Countsub(String str, int si, int ei){
        if(si > ei){
            return 0;

        }
        int firstCharRemoved = Countsub(str, si+1,ei);
        int lastCharRemoved = Countsub(str, si, ei-1);
        int FirstLastCharRemoved = Countsub(str,si+1,ei-1);

        int ans = firstCharRemoved + lastCharRemoved - FirstLastCharRemoved ;// common substrigs after removing first and last char 

        if(str.charAt(si) == str.charAt(ei)){
            ans++;
        }
        return ans;

    }
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();

        int ans  = Countsub(str,0,n);
        System.out.println(ans);
        
    }
    
}
