import java.util.Scanner;
class CheckOdd {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int a = sc.nextInt();
        String b = a%2 != 0 ?("this is a odd number"):("this is a even number");
        System.out.println(b);

    }
}
 /*Output
  * compile time success
  runtime success
  enter the value
  45
  This is a odd number
  enter the value
  22 
  This is a even number
  */
