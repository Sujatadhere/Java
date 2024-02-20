import java.util.Scanner;
 class BuzzNumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        String result =(num<=99&&num>=10)?((num%7==0||num%10==7)?("The given number is Buzz"):("The given number is not Buzz")):("invalid number");
        System.out.println(result);  
    }   
 }        
/*Output
 * compile time success
 * runtime success
 * Enter the number:
 * 77
 * The given number is Buzz
 */
