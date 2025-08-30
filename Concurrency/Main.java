package Concurrency;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();

        Runnable printfirst = () -> System.out.println("first");
        Runnable printsecond = () -> System.out.println("second");
        Runnable printthird = () -> System.out.println("third");

        Thread t1 = new Thread(()->{
            try{
                foo.First(printfirst);
            }
            catch(InterruptedException e){
         e.printStackTrace();
            }
        });

        Thread t2 = new Thread(()->{
            try{
                foo.Second(printsecond);;
            }
            catch(InterruptedException e){
         e.printStackTrace();
            }
        });

        Thread t3 = new Thread(()->{
            try{
                foo.Third(printthird);;
            }
            catch(InterruptedException e){
         e.printStackTrace();
            }
        });

        t3.start();
        t2.start();
        t1.start();
    }
}

class Foo{
    private Semaphore SecondReady = new Semaphore(0);
    private Semaphore ThirdReady = new Semaphore(0);

    public Foo(){}

    public void First(Runnable printfirst) throws InterruptedException{
       printfirst.run();
       SecondReady.release(); // release the lock
    }

    public void Second(Runnable printsecond) throws InterruptedException{
        SecondReady.acquire(); // wait for first one is done
        printsecond.run();
        ThirdReady.release(); // lock is release
    }

    public void Third(Runnable printthird) throws InterruptedException{
        ThirdReady.acquire();  // wait for first one is done
        printthird.run();
    }
}