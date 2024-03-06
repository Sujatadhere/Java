public class DoWhileOdd {
    public static void main(String[] args) {
        //print digit given number
        int a = 2345;
        do{
            int r=a%10;
            if (r%2==0){
                System.out.println(r);   
            }
            a= a/10;
        }while(a>0);
                
        } 
    }
    
    /*
     * Output:
     * compile time success
     * runtime success
     * 4
     * 2
     */
