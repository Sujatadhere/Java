public class DoWhileDigitPrint {
    public static void main(String[] args) {
        //print digit given number
        int a = 2345;
        do{
        int r = a%10;
        System.out.println(r);
        a=a/10;
        }while(a>0);

    }
    
}

/*
 * Output:
 * compile time success
 * runtime success
 * 5
 * 4
 * 3
 * 2
 */