public class PrintFactorial2To8 {
    public static void main(String[] args) {
        int start=2;
        while(start<=8){
            int i=start;
            int fact=1;
            while(i>0){
                fact=fact*i;
                i--;        
            }
            System.out.println("the factorial of "+start +"is"+fact);
            start++;
        }
    }
    
}

    /*
    Output:
    compile time successful
    run time successful
    the factorial of 2is2
    the factorial of 3is6
    the factorial of 4is24
    the factorial of 5is120
    the factorial of 6is720
    the factorial of 7is5040
    the factorial of 8is40320
    */