public class TechNumber {
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
            //check tech number
            int sum=f_half+s_half;
            int sumsqr=sum*sum;
            if(sumsqr==c)
            {
                System.out.println("the number is tech number");
            }
            else
            {
                System.out.println("the number is not tech number");
            }
        }
        else{
            System.out.println("the number is having odd number of digit");
        }
           // System.out.println("first half="+f_half);
           // System.out.println("second half="+f_half);
            

        }

    }

    /*
     * Output:
     * compile time successful
     * run time successful
     * Divisor= 100
     * the number is not tech number
     */

