public class AgeClass {
        public static void main(String[] args) {
            int k=21;
            int d=88;
            int r=90;
            int s=20;
            //(21>20)?((21>25)?((21>26)?(21):(26)):(25>26?(25):(26)):(20>25?((20>26)?(20):(26)):(26>25)?(25):(26));
            int Result= (k>d) ? ((k>r)? ((k>s) ? (k):(s)) :(r>s ? (r) :(s))):(d>r ? ((d>s)? (d): (s)):(r>s)?(r):(s));
            System.out.println("Result :" +Result);
        } 
    }
    
    /*output:
     Compile time success
     Run time success
     Result :90
     */
