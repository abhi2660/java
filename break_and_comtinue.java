public class break_and_comtinue {
    public static void main(String[] args) {

//        for (int i=1;i<=5;i++)
//        {
//            System.out.println("veer " +i);
//            if(i==2){
//                System.out.println("you are gone");
//                break;
//            }
//            System.out.println("and i also ");
//        }


        for (int i=1;i<=5;i++)
        {
            if(i==2){
                System.out.println("you are gone");
              continue;
            }
            System.out.println("veer "+ i);

        }

    }
}
