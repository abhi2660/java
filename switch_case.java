
import java.util.*;
public class switch_case {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter age");
        int age =sc.nextInt();
// age variable can be string,char and int in java
        switch (age){
//            case 18:
//                System.out.println("you are alert");
//                break;
//            case 56:
//                System.out.println("you are senior citizen");
//                break;
//            default :
//                    System.out.println("enjoy your life");

//            enhance switch
//            it dose not require break to go out of the loop after matching a case  

            case 34 ->{
                System.out.println("you are good");
                System.out.println("you are .....");
                System.out.println("you are ____");
            }

       case 45 ->{
           System.out.println("you are 45");
           System.out.println("_______");
           System.out.println("........");
       }
            default ->
                System.out.println("enjoy your life");
        }
    }
}
