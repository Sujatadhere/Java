import java.util.Scanner;
 class SwapNumberMultiDiv{ 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //with out using third variable (mul%Div)
        System.out.println("enter the number 1");
        int num1 = sc.nextInt();
        System.out.println("enter the number 2");
        int num2 =sc.nextInt();
        System.out.println("the value of num 1 & num 2 before swapping is "+num1+":"+num2);
        //update num1
        num1= num1*num2;
        //update num2
        num2= num1/num2;
        //update num1
        num1= num1/num2;

        System.out.println("the value of num 1 & num 2 after swapping is "+num1+":"+num2);
        
    }
    }

/*Output:
compile time success
runtime success
enter the number 1
64
enter the number 2
24
the value of num 1 & num 2 before swapping is 64:24
the value of num 1 & num 2 after swapping is 24:64
 * 
 */

