public class DivideNumberToHalf {
    public static void main(String[] args) {
        int a=2341;
        int b=a;
        int c=a;
        int count=0;
        while(a>0){
            a=a/10;
            count++;
        }
        if(count%2==0)
        {
            //find divisor
            int div=1;
            for(int i=1;i<=count/2;i++)
            {
                div=div*10;
            }
            System.out.println("Divisor= " +div);
            int f_half=b/div;
            int s_half=b%div;
            System.out.println("first half="+f_half);
            System.out.println("second half="+s_half);


        }else

        {
            System.out.println("The number is having odd number of digits");

        }

        }
        
    }
    
    /*
     * Output:
     * compile time successful
     * run time successful
     * Divisor= 100
     * first half=23
     * second half=41
     */

