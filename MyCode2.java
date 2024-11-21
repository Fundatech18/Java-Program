class Thred2 implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class MyCode2 {
    public static void main(String[] args) {
        Thred2 t1 = new Thred2();
        Thred2 t2 = new Thred2();

        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t2);

        tt1.setName("Thread - 1");
        tt2.setName("Thread - 2");

        tt1.start();
        tt2.start();

        try{
            tt1.join();
            tt2.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println(Thread.currentThread().getName());
    }
}
