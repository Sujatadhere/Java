public class Lcm {
    public static void main(String[] args) {
        int num1=14;
        int num2=25;
        int largest=(num1>num2)?(num1):(num2);
        while(true){
            if(largest%num1==0 && largest%num2==0)
            {
                System.out.println("the lcm of given no is"+largest);
                break;
            }
            largest++;
        }
        
    }
    
}

/*
 * Output:
 * compile time successful
 * run time successful
 * the lcm of given no is 350
 */