public class CoPrime {
    public static void main(String[] args) {
        int n1=10;
        int n2=11;
        int c=0;
        int i=1;
        int small=(n1<n2)?(n1):(n2);
        for(;i<=small;i++){
            if(n1%i==0&&n2%i==0){
                c++;
                if(c>1){
                    break;
                }
            }
            
        }
        if(c==1){
            System.out.println("Co Prime Number");

        }
        else{
            System.out.println("Not Co Prime Number");
        }
        
    }
    
}

/*
 * Output:
 * compile time successful
 * run time successful
 * Co Prime Number
 */

