public class PrimeNumber {
    public static void main(String[] args) {
        int a =2;
        int b =11;
        int c= 0;
        while(a<b)
        {
            if(b%a==0)
            {
                c++;
                
            }
            a++;

        }
        if(c==0)
        {
            System.out.println(b+"is prime number");
            
        }
        
    }
    
}

/*
 * Output:
 * compile time success
 * rumtime success
 * 11is prime number
 */