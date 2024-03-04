public class  ExampleSwitch {
    public static void main (String []args){
        //using final we can create fix value
        // in the duplicate case value are not allowed
        //we can pass expression in the palce of value
        final int a= 4;
        int daynum=3;
        //(->)Using this symbol we can prevent fall through
        switch(daynum){
            case 1->System.out.println("monday");
            
            case 2->System.out.println("tuesday");
            
            case 3->System.out.println("wednesday");
            
            case a->System.out.println("thursday");
            
            case 5->System.out.println("friday");
            
            case 6->System.out.println("saturday");
            
            case 7->System.out.println("sunday");
            
            default->System.out.println("invalid");
        }
    }
}

/*Output:
compile time success
runtime success
wednesday
 * 
 */