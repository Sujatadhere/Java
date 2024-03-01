import java.util.Scanner;
  class ExampleIf_Else12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        if(num>=10&&num<=99)
        {
            if(num%2==0)
            {
                System.out.println("number is even");
            }
            else
            {
                System.out.println("number the odd");
            }
        }
        else
        {
            System.out.println("The given number is not two digit number");

        }
            }

        }
  


 /*Output:
 compile time success
 runtime success
 Enter the number
 44
 Number is even
 Enter the number
 33
 Number the odd
  * 
  */