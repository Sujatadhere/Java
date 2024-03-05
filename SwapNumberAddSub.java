import java. util.Scanner;
 class SwapNumberAddSub {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //with out using third variable add&sub
    System.out.println("Enter number 1");
    int num1=sc.nextInt();
    System.out.println("Enter number 2");
    int num2=sc.nextInt();
    System.out.println("the value of num1 & num 2before swapping is"+num1+":"+num2);
    
    //update num1
    num1=num1+num2;
    //update num2
    num2=num1-num2;
    //update num1
    num1=num1-num2;
    System.out.println("the value of num1 & num2 after swapping is"+num1+":"+num2);

}
}

/*Output:
compile time success
runtime success
Enter number 1
55
Enter number 2
24
the value of num1 & num 2before swapping is55:24
the value of num1 & num2 after swapping is24:55
 * 
 */

