public class CheakMark {
   public static void main(String[] args) {
    int Mark=56;
    char result= (Mark >=90 && Mark <=100)?('A'):((Mark >=90 && Mark >=75)?('B'):(Mark <75 && Mark >=55)?('C'):(Mark <55 && Mark >=35)?('E'):('F'));
    System.out.println(result);
   } 
}
 
/*OutPut:
compile time success
run time success
c
 
 */