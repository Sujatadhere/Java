import java.util.Scanner;
 class CheckNoChar {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        char b ='B';
        int c  =(int) b;
        String result =(a==c)?("This is a same value"):("This is a not same value");
        System.out.println(result);
    }
        
    }
    /*Output
     * compile time success
     * runtime success
     * Enter the number
     * 3
     * This is a not same value
     */

