import java.util.Scanner;
public class CheckSumDivisibleOrNot {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int a=sc.nextInt();
    int sum=0;
    int A=a;
    do{
        int r=a%10;
        sum=sum+r;
        a=a/10;
    }while(a>0);
    System.out.println(sum);
    if(A%sum==0){
        System.out.println("Divisible");
    }
    else{
        System.out.println("Not Divisible");
    }

    }
    }
    
    /*
     * Output:
     * compile time success
     * runtime success
     * Enter the number
     * 45
     * 9
     * Divisible
     */

