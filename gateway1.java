class student{
    String name;
    int roll;

    void setdetails(int r,String n){
        roll=r;
        name=n;
    }


    public class gateway1 {
    public static void main(String[] args ) {

        student s1,s2,s3;
        s1=new student();
        s2=new student();
        s3=new student();
        s1.setdetails(56,"abhi");
        s2.setdetails(6,"abeer");
        s3.setdetails(5,"veer");

        s1.printstudent();
        s2.printstudent();
        s3.printstudent();
    }
}


    void printstudent()
    {
        System.out.println("Roll no= " + roll);
        System.out.println("Name= " + name);
    }
}



