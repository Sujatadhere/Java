public class CheakOddEven {
    public static void main(String[] args) {
        //Add two number
      int a =10;
      int b =20;
      int sum1 =a+b;
      System.out.println("The sum of a and b is:"+sum1);
      //print first digit
      int c = sum1 / 10;
      System.out.println("first Digit is:"+c);
      //print last digit
      int d = sum1 % 10;
      System.out.println("Last Digit is:"+d);
      
      //sum of two number
      int sum2 = c+d;
      System.out.println("The sum of c and d is:"+sum2);
      //To cheak sum of two number is odd or even
      String Result=(sum2/2==0)? "This number is Even" : "This number is Odd";
      System.out.println("Result :" +Result);
    }
    
}
 
 /*Output:
 compile time success
 The sum of a and b is :30
 First Digit is :3
 Last Digit is :0
 The sum of c and d is :3
 Result :This number is odd
  
  */
