import java.util.Scanner;
 class SwapNumber {
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1");
        int num1 =sc.nextInt();
        System.out.println("enter the number2");
        int num2 = sc.nextInt();
        int c = 0;
        System.out.println("the value of num1 & num2 before swapping is"+num1 +":"+num2);
        c= num1;
        num1= num2;
        num2=c;
        System.out.println("after swapping is "+num1 +":"+num2);
    }
    }


    /*Output:
    compile time success
    runtime success
    enter the number 1
    22
    enter the number2
    44
    the value of num1 & num2 before swapping is22:44
    after swapping is 44:22
     */
