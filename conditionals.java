public class conditionals {
    public static void main(String[] args) {
        int age=45;

//        if-else condition

        if(age>18)
        {
            System.out.println("you can drive");

            if (age>60) {
                System.out.println("you can not drive");
            }
        }
        else {
            System.out.println("you can not drive");
        }
    }
}
