public class NeonNumber {
    public static void main(String[] args) {
        int num=9;
        int b=num;
        int sum=0;
        //find squr
        int squr=num*num;
        //Add the squr digit
        System.out.println(squr);
        while(squr>0){ //81%10
            int r=squr%10;
            //0+1
            sum=sum+r;
            squr=squr/10;
            }
            if(sum==b){
                System.out.println("the number is neon");
            }
            else
            {
                System.out.println("the number is not neno");
            }
        
    }
    
    }

    /*
     * Output:
     * compile time successful
     * run time successful
     * 81
     * the number is neon
     */
    

