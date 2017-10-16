package java2days.examples.lombok;

public class Synchronized {

    Object lock = new Object();

    @lombok.Synchronized
    public void doSomething() {
        System.out.println();
    }

    @lombok.Synchronized("lock")
    public void doSomethingElse() {
        System.out.println();
    }
}
