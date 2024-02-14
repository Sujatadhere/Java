public class TernaryOperator {
    public static void main(String[]args)
    {
        int a=12;
        int b=100;
        int c=50;
        int d=45;
        int Result=(a>b) ? ((a>c) ? ((a>d) ? a:d) :c):((b>c) ? ((b>d) ? b:d) :c);
        System.out.println("The larger value is:"+Result);
    }
}
 
/*Output
 * Complie Time = Success
 * RunTime = success
 *  The larger value is:100

  */