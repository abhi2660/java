public class gateway2 {
    public static void main(String[] args) {
        Student s1,s2,s3;
        s1=new Student();
        s2=new Student();
        s3=new Student();
        Student.college="ABIC";
        s1.set(56,"abhi");
        s2.set(6,"abeer");
        s3.set(5,"veer");

        s1.print();
        s2.print();
        s3.print();
    }
}

class Student{
    String name;
    int rollno;
    static String college;

    void print()
    {
        System.out.println("name= "+ name);
        System.out.println("roll "+ rollno);
        System.out.println("college name= "+ college);
    }

    void set(int r,String n){
        rollno=r;
        name=n;
    }
}