import java .util.Scanner;
 class ExampleIf_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two digit number");
        int num = sc.nextInt();
        if (num%7==0 || num%10==7)
        {
            System.out.println("number is buzz number");
        }
        else
        {
            System.out.println("Not a buzz number");
        }
        }
    }

   /*OUTPUT:
   compile time success
   runtime success
   Enter the two digit number
   22
   Not a buzz number
   Enter the two digit number
   77
   number is buzz number

    */ 
