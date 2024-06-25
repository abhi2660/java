// SUPER class
class base3{

//    by default run constructor
    base3(){
        System.out.println("base 3");
    }

    base3(int a){
        System.out.println("with a value");
    }
    base3(int a,int b){
        System.out.println("with a and b value");
    }

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class base4 extends base3{
    base4(){

       /*
        1. SUPER keyword is used to access the  constructor of SUPER class

        2. SUPER keyword call the constructor with a integer value
        and if we not use SUPER keyword then it call default constructor */


//        super(0);
        System.out.println("in base4");
    }


    base4(int x , int y){

//        super(0);
        System.out.println("overloaded constructor in base4 with two variable");
    }

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


class child extends base4{
    child(){
//        super(8,9);
        System.out.println("i am in child");
    }
}


public class constructors_in_inheritance {
    public static void main(String[] args) {

//        if we pass any integer with creating a new base3 object then it call constructor with a
// base3 b=new base3(2);

//        base4 b1=new base4();

child c= new child();

    }
}



/*

1. if we does not create any constructor in child class and create
new object of child class then the constructor of parent class is run
automatically

2. if extends the class which extends the other class and we create the
new object on grand child then it call it's constructor , it's parents constructor
and and it's grand parent constructor



*/