public class gateway3 {
    static int x;
    int y;

    public static void main(String[] args) {
        System.out.println(x);
      //  System.out.println(y); // gives error because a static variable can not access non static variable
         //but a non static variable can access the static variable

//        to access non static variable in static function create the respective class

        gateway3 a=new gateway3();
        System.out.println(a.y);

//        int z;
//        System.out.println(z);
//    to access local varible first initiallige the local variable because without inntiallization mamory not allocated to local variable

        int z=4;
        System.out.println(z);


    }
}
