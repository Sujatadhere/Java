import java .util.Scanner;
 class InputName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String name  = sc.next();
        System.out.println(name);
        String name2 ="sujata";
        String result = (name==name2)?("true"):("false");
        System.out.println(result);
    }   
}
/*Output
 * compile time success
 * runtime success
 * Enter the String 
 * sujata
 * sujata
 * false
 */