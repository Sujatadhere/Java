import java.util.Scanner;
 class SwitchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");

        int number = sc.nextInt();
        System.out.println("Enter chioce:");
        int key = sc.nextInt();

        switch(key)
        {
            case 1: if (number%2==0);
            {
                System.out.println("number is even");
            }
            
            {
                System.out.println("enter is odd");
            }break;

            case 2: if(number%7==0 || number%10==7)
            {
                System.out.println("number is buzz");
            }
            else
            {
                System.out.println("number is not buzz");
            }
            break;
            
            case 3: if (number>=0){
                System.out.println("number is positive");
            }
            else{
                System.out.println("number is negative");
            }
            break;
            
            case 4: if(number<99&& number>10)
            {
                System.out.println("two digit number");
            }
            else{
                System.out.println("not two digit number");
            }
            break;
        
            }
            }
            }
            

            /*Output:
            compile time success
            runtime success
            Enter the number:
            33
            Enter chioce:
            3
            number is positive
            Enter the number:
            58
            Enter chioce: 
            2
            number is not buzz

            Enter the number:
            535
            Enter chioce:   
            4
            not two digit number

            Enter the number:
            22
            Enter chioce:
            1
            number is even
            enter is odd  
             */