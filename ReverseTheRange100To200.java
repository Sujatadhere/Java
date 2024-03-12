public class ReverseTheRange100To200 {
    public static void main(String[] args) {
        int start=100;
        while(start<=200);
        {
            System.out.println(start);//conditionremove
            start++;
        }
        int num=150;//start
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }   
        System.out.println(rev);
//start++;
        }
        
        }
    



        

        

    

