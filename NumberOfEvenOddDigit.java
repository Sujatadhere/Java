public class NumberOfEvenOddDigit {
    public static void main(String[] args) {
        int a= 3456;
        int odd=0;
        int even=0;
        do{
            int r=a%10;
            if(r%2==0)
            {
                even ++;
            }
            else{
                odd ++;
            }
        
            a= a/10;
        }while(a>0);
            System.out.println("the number odd digit= " +odd + " the number even digit= " +even);


            
            }
        
        }

    /*
     * Output:
     * compile time success
     * runtime success
     * the number odd digit= 2 the number even digit= 2
     */

