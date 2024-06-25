
import java.util.*;

public class exceptions {

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int[] arr ={45,67,78};
        int i,a, ans=0;
        System.out.println("enter index");
        try{
            i=sc.nextInt();
            System.out.println("enter a value");
            a=sc.nextInt();
            ans=arr[i]/a;
        }catch (Exception ee){
            System.out.println(ee);
        }


        System.out.println("done");
    }
}
