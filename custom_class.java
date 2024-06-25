
class employee{
//    attributes
    int id;
    String name;

    void print(){
        System.out.println("my name is "+name+ " and id is "+ id);
    }
}


public class custom_class {
    public static void main(String[] args) {

//        instantiating new object
        employee veer= new employee();

//        setting attributes
        veer.id=67;
        veer.name="abhi";

//        print attributes
//        System.out.println(veer.id);
//        System.out.println(veer.name);

        veer.print();

    }
}


//in a java file only one public class exists