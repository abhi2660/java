class a{
    public int  veer(){
        return 5;
}

public void meth(){
    System.out.println("method 2");
}

}

class b extends a{

    @Override
    public void meth(){
        System.out.println("method 2 in class b");
    }

    public void meth3(){
        System.out.println("third method in class b");
    }
}

public class method_overriding {
    public static void main(String[] args) {
//        a A =new a();
//        A.meth();
        b B=new b();
        B.meth();

    }
}
