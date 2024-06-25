/*
import java.io.*;


public class io_package {

    public static void main(String[] args) {
    try {
//        FileInputStream fin = new FileInputStream("C:\\Users\\Victus\\Downloads\\veer.txt");
        FileInputStream fin = new FileInputStream("C:\\Users\\Victus\\IdeaProjects\\first\\src\\logical.java");
        int a1 = fin.read();
        int a2 = fin.read();
        int a3 = fin.read();
        fin.skip(5);
        byte [] b=new byte[4];
        fin.read(b);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        int a4=fin.available();
        System.out.println("remaining "+a4);
        fin.close();
    }
    catch (Exception ee){
        System.out.println(ee);
    }


    }
}
*/

/*
import java.io.*;


public class io_package {

    public static void main(String[] args) {
        try {
//        FileInputStream fin = new FileInputStream("C:\\Users\\Victus\\Downloads\\veer.txt");
            FileInputStream fin = new FileInputStream("C:\\Users\\Victus\\IdeaProjects\\first\\src\\logical.java");
            int a1 = fin.read();
           while(a1>0){
//               System.out.println(a1);
               System.out.print((char)(a1));

               a1=fin.read();

           }
            fin.close();
        }
        catch (Exception ee){
            System.out.println(ee);
        }


    }
}


 */

/*
import java.io.*;


public class io_package {

    public static void main(String[] args) {
        try {
//        FileInputStream fin = new FileInputStream("C:\\Users\\Victus\\Downloads\\veer.txt");
            FileInputStream fin = new FileInputStream("C:\\Users\\Victus\\IdeaProjects\\first\\src\\loop_control.java");
            int a1 = fin.available();
            byte [] b= new byte[a1];
            fin.read(b);


//            int i=0;
//            while(i<a1){
//                System.out.print((char) (b[i]));
//                i++;
//            }


            String str= new String(b);
            System.out.println(str);
            fin.close();
        }
        catch (Exception ee){
            System.out.println(ee);
        }


    }
}


*/


//----------------------------------------------------------------------------------------------------------------------

/*
import  java.io.*;

public class io_package{

    public static void main(String[] args) {
try {
    FileOutputStream fil =new FileOutputStream("C:\\Users\\Victus\\Downloads\\veer.txt");

    fil.write(65);
    fil.write(90);
    byte [] dt= {99,108,104,123};
    fil.write(dt);
    fil.close();


}catch(Exception ee){
    System.out.println(ee);
}

    }

}

*/



//import  java.io.*;
//import java.util.*;
//public class io_package{
//
//    public static void main(String[] args) {
//        try {
//       Scanner sc= new Scanner(System.in);
//            System.out.println("give source file path");
//            String src=sc.nextLine();
//            System.out.println("give destination file path");
//            String dst=sc.nextLine();
//        FileInputStream fin = new FileInputStream(src);
//        FileOutputStream fil = new FileOutputStream(dst);
//
//        int a1;
//        a1=fin.read();
//        while (a1>0){
//            fil.write(a1);
//            a1=fin.read();
//        }
//        fin.close();
//        fil.close();
//        }catch(Exception ee){
//            System.out.println(ee);
//        }
//
//    }
//
//}

//dstn=C:\\Users\\Victus\\Downloads\\veer.txt
//src=C:\\Users\\Victus\\IdeaProjects\\first\\src\\loop_control.java


//------------------------------------------------------------------------------------------------------------------

//another method


//import  java.io.*;
//import java.util.*;
//public class io_package{
//
//    public static void main(String[] args) {
//        try {
//            Scanner sc= new Scanner(System.in);
//            System.out.println("give source file path");
//            String src=sc.nextLine();
//            System.out.println("give destination file path");
//            String dst=sc.nextLine();
//            FileInputStream fin = new FileInputStream(src);
//            FileOutputStream fil = new FileOutputStream(dst);
//
//            int a1= fin.available();
//            byte [] b= new byte[a1];
//            fin.read(b);
//            fil.write(b);
//            fin.close();
//            fil.close();
//        }catch(Exception ee){
//            System.out.println(ee);
//        }
//
//    }
//
//}


//src=C:\\Users\\Victus\\IdeaProjects\\first\\src\\loop_control.java
//dstn=C:\\Users\\Victus\\Downloads\\veer2.txt




//---------------------------------------------------------------------------------------------------------------------


//import  java.io.*;
//import java.util.*;
//public class io_package{
//
//    public static void main(String[] args) {
//        try {
//
//            FileReader fin= new FileReader("C:\\Users\\Victus\\IdeaProjects\\first\\src\\loop_control.java");
//          int a= fin.read();
//          int b= fin.read();
//          int c= fin.read();
//          int d= fin.read();
//            System.out.println((char) (a));
//            System.out.println((char) (b));
//            System.out.println((char) (c));
//            System.out.println((char) (d));
//    fin.close();
//
//        }catch(Exception ee){
//            System.out.println(ee);
//        }
//
//    }
//
//}



//-------------------------------------------------------------------------------------------------------


//import  java.io.*;
//import java.util.*;
//public class io_package{
//
//    public static void main(String[] args) {
//        try {

//bfr return null after reading all lines
//
//            FileReader fin= new FileReader("C:\\Users\\Victus\\IdeaProjects\\first\\src\\loop_control.java");
//            BufferedReader bfr = new BufferedReader(fin);
//            String s1= bfr.readLine();
//            String s2= bfr.readLine();
//            String s3= bfr.readLine();
//            System.out.println(s1);
//            System.out.println(s2);
//            System.out.println(s3);
//
//    fin.close();
//
//        }catch(Exception ee){
//            System.out.println(ee);
//        }
//
//    }
//
//}

//-----------------------------------------------------------------------------------------

//when data in binary but we want to read it line by line
//so first convert it into string then read it line by line


//import  java.io.*;
//import java.util.*;
//public class io_package{
//
//    public static void main(String[] args) {
//        try {
//
//            FileInputStream fin= new FileInputStream("C:\\Users\\Victus\\IdeaProjects\\first\\src\\loop_control.java");  // read data in binary fotmate
//            InputStreamReader fn= new InputStreamReader(fin);                                                                   // convert data in string
//            BufferedReader bfr = new BufferedReader(fn);
//            String s1= bfr.readLine();
//            String s2= bfr.readLine();
//            String s3= bfr.readLine();
//            System.out.println(s1);
//            System.out.println(s2);
//            System.out.println(s3);
//
//            fin.close();
//
//        }catch(Exception ee){
//            System.out.println(ee);
//        }
//
//    }
//
//}



//-----------------------------------------------------------------------------------------------------------------

//to read data from keyboard which occurs in system in binary formate


import  java.io.*;
public class io_package{

    public static void main(String[] args) {
        try {

            InputStreamReader fn= new InputStreamReader(System.in);                                             // take input from keyboard in binary format and convert it in string
            BufferedReader bfr = new BufferedReader(fn);
            String s1= bfr.readLine();
            String s2= bfr.readLine();
            String s3= bfr.readLine();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);


        }catch(Exception ee){
            System.out.println(ee);
        }

    }

}