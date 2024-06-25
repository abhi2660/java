
interface camera{
    void takesnap();
    void recordvideo();
}


interface wifi{
    String[] getnetworks();
    void connectingnetworks(String networks);
}

class MyCellPhone{
    void callNumber(int number){
        System.out.println("calling"+ number);
    }

    void pickCall(){
        System.out.println("connecting");
    }
}


class smartPhone extends MyCellPhone implements wifi,camera{
    @Override
    public void takesnap(){
        System.out.println("taking snap");
    }

    @Override
    public void recordvideo() {
        System.out.println("recording video");
    }

    @Override
    public String[] getnetworks(){
        System.out.println("getting networks");
        String[] networklist={"harry","veer"};
        return networklist;
    }

    public void connectingnetworks(String networks){
        System.out.println("conneting to "+ networks);
    };
}

public class intreface {
    public static void main(String[] args) {
        smartPhone s=new smartPhone();
        String[] ns=s.getnetworks();
        for (String item:ns){
            System.out.println(item);
        }

    }
}
