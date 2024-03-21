class Increment{
    int a;

    synchronized void increment(){
        a++;
    }
}

class LPU{
    public static void main(String args[]) throws InterruptedException{

        Increment inc = new Increment();

        Runnable obj1 = () -> {
            for(int i = 0; i < 10000; i++){
                inc.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int i = 0; i < 10000; i++){
                inc.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(inc.a);
    }
}

