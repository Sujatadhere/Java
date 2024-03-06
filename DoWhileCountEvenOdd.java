public class DoWhileCountEvenOdd {
    public static void main(String[] args) {
        //print reverse the value
        int a= 3245;
        int rev=0;
        do{
            int r= a%10;
            //change the value so we neet to multiply by 10
            rev=(rev*10)+r;
            a=a/10;
        }while(a>0);
        System.out.println(rev+"the rev value");

            }
        }
    
        /*
         * Output:
         * compile time success
         * runtime success
         * 5423 the reverse value
         */
    

