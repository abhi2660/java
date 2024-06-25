

    class base{
        int x;

        public int getX() {
            System.out.println("i am in base and set x now");
            return x;
        }

        public void setX(int x) {
            this.x = x;

        }

        public void printMe(){
            System.out.println("i am veer");
        }
    }

    class base2 extends base{
    int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public class inheritance {

        public static void main(String[] args) {
            base2 b =new base2();
            b.setX(6);
            System.out.println(b.getX());
        }



}


/*
if we use inheritance property in programs then we use the upper (parent)
 class property in lower(child) class
*/