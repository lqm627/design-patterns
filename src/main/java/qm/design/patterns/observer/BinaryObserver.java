package qm.design.patterns.observer;

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        //以2进制标识的字符串
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
