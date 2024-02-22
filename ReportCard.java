 import java.util.Scanner;
public class ReportCard {
    public static void main(String[]rc){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String name=sc.nextLine();
        System.out.println("Enter Student Roll Number:");
        int roll =sc.nextInt();
        System.out.println("Enter Exam Name:");
        String exam=sc.next();
        System.out.println("Enter Subject Marks:");


        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        int total=(a+b+c+d+e);
        float percent=(total/5);
        System.out.println(percent);

       int per=(int)percent;
        char grade=(per<=100&&per>=75)?('A'):((per<75&&per>=60)?('B'):((per<60&&per>=45)?('C'):((per<45&&per>=35)?('D'):('F'))));

        String remark=(grade=='A')?("** Very Good **"):((grade=='B')?("* Good *"):((grade=='C')?("$ Need Improvement $"):((grade=='D')?("Work Hard"):("Better Luck Next Time"))));

        System.out.println("");
        System.out.println("============================================= Report Card ======================================");
        System.out.println("");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::: X.Y.Z.SCHOOL MUMBAI ::::::::::::::::::::::::::::::::");
        System.out.println("");
        System.out.println("''''''''''''''''''''''''''''''''''''''''''''''   C.B.S.E  ''''''''''''''''''''''''''''''''''''''");
        System.out.println("================================================================================================");
        System.out.println("");
        System.out.println("Student Name:"+name+"                                                            "+"Date:21/02/2024");
        System.out.println("");
        System.out.println("Roll Number:"+roll+"                                                             "+"Exam Name:"+exam );
        System.out.println("");
        System.out.println("************************************************************************************************");
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------");
      System.out.println("Subject                                    Out Of                                  Mark Obtained");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Chemistry                                    100                                            "+a);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("physics                                      100                                            "+b);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Biology                                      100                                            "+c);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Math                                         100                                            "+d);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("English                                      100                                            "+e);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Total                                        500                                            "+total);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("================================================================================================");
        System.out.println("Percentage:"+percent+"                                                                          Grade:"+grade);
        System.out.println("");
        System.out.println(remark);
        System.out.println("================================================================================================");
        System.out.println("");
        System.out.println("");



    }


}

/*output:-
    compile Time = Success
    Run Time = Sucess
                        
                     
Enter Student Name:
sujata
Enter Student Roll Number:
5314
Enter Exam Name:
MidSem
Enter Subject Marks:
76
76
76
86
87
88.0
============================================= Report Card ======================================
::::::::::::::::::::::::::::::::::::::::::: X.Y.Z.SCHOOL MUMBAI ::::::::::::::::::::::::::::::::
''''''''''''''''''''''''''''''''''''''''''''''   C.B.S.E  ''''''''''''''''''''''''''''''''''''''
================================================================================================
Student Name:sujata                                                           Date:21/02/2024
Roll Number:5314                                                             Exam Name:MidSem
************************************************************************************************
------------------------------------------------------------------------------------------------
Subject                                    Out Of                                  Mark Obtained
------------------------------------------------------------------------------------------------
Chemistry                                    100                                            76
------------------------------------------------------------------------------------------------
physics                                      100                                            76
------------------------------------------------------------------------------------------------
Biology                                      100                                            76
------------------------------------------------------------------------------------------------
Math                                         100                                            86
------------------------------------------------------------------------------------------------
English                                      100                                            87
------------------------------------------------------------------------------------------------
Total                                        500                                            401
------------------------------------------------------------------------------------------------
================================================================================================
Percentage:80.0                                                                          Grade:A
** Very Good **
================================================================================================
*/
