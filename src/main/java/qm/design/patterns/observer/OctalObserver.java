package qm.design.patterns.observer;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        //以8进制标识的字符串
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
