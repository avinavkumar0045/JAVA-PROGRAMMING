

public class oneTryAndCatch {
    public static void main(String[] args) {
        int a =10;
        int b =0;

        try {
           int ans  = a /b;
           System.out.println("Answer is "+ans);
        } catch (Exception e) {
            System.out.println("Error , the denominator is 0");
        }
        finally{
            System.out.println("Program continues after handling the exeption");
        }
    }
}
