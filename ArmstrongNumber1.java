public class ArmstrongNumber1 {
    public static void main(String[] args) {
        int num=153;
        int numcopy=num;
        int numcopy1=num;
        int count=0;
        // find count or power
        while(num>0)
        {
            count++;
            num=num/10;
        }
        // fetching each digit 
        int result=0;       
        while(numcopy>0) 
        {
            int base=numcopy%10;
            // calculate power of each digit power is count
            int product=1;
            for(int i=1; i<=count; i++)
            {
                product=product*base;
            }
            numcopy=numcopy/10;
            result=result+product;      
        }
        if (numcopy1==result) 
        {
            System.out.println("Given number is Amstrong number");
        }
        else
        {
            System.out.println("Given number is not Amstrong number");
        }
    }
}


    /*
     * Output:
     * compile time successful
     * runtime successful
     * Given number is Amstrong number
     */

    