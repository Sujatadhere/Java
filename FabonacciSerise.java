public class FabonacciSerise {
    public static void main(String[] args) {
        int n=6;
        int a=0;
        int b=1;
        for(int i=0;i<=n;i++){
            int result=a+b;
            a=b;
            b=result;
            System.out.println(result);
        }
    }
    
}

/*
 * Output:
 * compile time successful
 * run time successful
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 21
 */