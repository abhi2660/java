/*
import java.util.*;


//if here we write extends with any builtin exception then not use try catch block and we have to create a class of custom exception class and throw it

class invalidAge extends RuntimeException{
   public String toString(){
//       System.out.println("veer bol rha h");
       return "invalid age:valid age between 18 to 60";
   }
}


public class customException {

    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int age;
        System.out.println("enter age");
            age = sc.nextInt();
        System.out.println(age);

        if(age <18 || age>60)
        {
            System.out.println("invalid age");
            invalidAge ee= new invalidAge();
           throw ee;
        }
    }
}
*/

/*
import java.util.*;

//if here we write extends with  exception then  use try catch block and we have to create a class of custom exception class and throw it

class invalidAge extends Exception{
    public String toString(){
        return "invalid age:valid age between 18 to 60";
    }
}


public class customException {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.println("enter age");
        age = sc.nextInt();
        System.out.println(age);

        if(age <18 || age>60)
        {
            System.out.println("invalid age");
            invalidAge ee= new invalidAge();
            try {
                throw ee;
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

 */
/*
import java.util.*;

//if we write throws keyword with main then do not use try and catch block only create a exception class and throw it

class invalidAge extends Exception{
    public String toString(){
        return "invalid age:valid age between 18 to 60";
    }
}


public class customException {

    public static void main(String[] args) throws invalidAge
    {
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.println("enter age");
        age = sc.nextInt();
        System.out.println(age);

        if(age <18 || age>60)
        {
            System.out.println("invalid age");
            invalidAge ee= new invalidAge();
            throw ee;
        }
    }
}
*/

