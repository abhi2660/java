
/*
* we use this keyword as the refrence of current  class. We use this
* keyword to pass the current class to other function */

    class oneClass{
        int a;


        public int getA() {
            return a;
        }

        oneClass(){
            System.out.println("in one class ");
        }

        oneClass(int v){
         this.a=v;
        }

      /*  oneClass(int a){
         a=a;
        }

//         if use same variable name as parameter and assign to each other
//        then it confuse and give wrong in formation and if we want to resolve
//        this problem then use this keyword as reference of the class
        */

        public int one(){
            return 1;
        }
    }

public class this_super {
    public static void main(String[] args) {
        oneClass one = new oneClass(5);
        System.out.println(one.getA());
    }
}

