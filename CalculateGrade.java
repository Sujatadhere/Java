public class CalculateGrade {
   public static void main(String[] args) {
    int CS =100;
    int AI =88;
    int WT =100;
    int DSBD =60;
    int CNS = 90;
    float persentage=((CS+AI+WT+DSBD+CNS)/500)*100;
    //It Convert TypeCast Float into Percent
    int per =(int)persentage;
    //Chaking Conduction Of Mark For Greater than
    char cheakresult=(per >=90 && per<=100)?('A'):(per <90 && per>=75)?('B'):(per <75 && per >=55)?('C'):(per <55 && per >=35)?('E'):('F');
    System.out.println("Gread="+cheakresult);
   } 
}
/*OutPut:
compile time success
runtime success
Gread=F
 * 
 */