import java.util.*;

class Greetings {

    boolean flag = false;

    public synchronized void hi() {

        if(!flag) {
            try {
                wait();
            }
            catch(Exception e) {
                System.out.println("Exception Caught");
            }
        }
        System.out.println("Hi");
        notify();
        flag = false;

    }

    public synchronized void hello() {

        if(flag) {
            try {
                wait();
            }
            catch(Exception e) {
                System.out.println("Exception Caught");
            }
        }
        System.out.println("Hello");
        notify();
        flag = true;

    }

}

public class ThreadWaitNotify {

    public static void main(String args[]) {

        Greetings g = new Greetings();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 100; i++) {
                    g.hi();
                    try {
                        Thread.sleep(1000);
                    }
                    catch(Exception e) {
                        System.out.println("Exception Caught");
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 100; i++) {
                    g.hello();
                    try {
                        Thread.sleep(3000);
                    }
                    catch(Exception e) {
                        System.out.println("Exception Caught");
                    }
                }
            }
        });

        t1.start();
        t2.start();

    }

}













