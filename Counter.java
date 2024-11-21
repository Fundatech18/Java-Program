class Cout{
    private int count = 0;

    public  void increment(){
        synchronized (this){
            count++;

        }
    }

    public int getCount(){
        return count;
    }
}

class MyThread extends Thread{
    private Cout cou;
    MyThread(Cout couy){
        this.cou = couy;
    }

    @Override
    public  void run() {
        for (int i = 0; i < 1000; i++) {
            cou.increment();
        }
    }
}

public class Counter {
    public static void main(String[] args) {
        Cout c = new Cout();
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println(c.getCount());
        }
    }
}
