public class DuckNumber {
    public static void main(String[] args) {
        int num=12805;
        int c=0;
        while(num>0){
            int rem=num%10;
            if(rem==0){
                c++;
            }
            num=num/10;
        }
        if(c==0){
            System.out.println("the number is duck number");
        }
        else{
            System.out.println("the number is not duck number ");
        }
    }
    
}

/*
 * Output:
 * compile time successful
 * run time successful
 * the number is not duck number 
 */
