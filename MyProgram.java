class OddThreads extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.println(i + " is Odd number");
            }
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class PrimeThreads implements Runnable{
    public void run(){
        int temp;
        int j;
        for(int i=2;i<100;i++){
            temp = i;
            for(j=2;j<=i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(j == temp){
                System.out.println("Prime : " + j);
            }
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class MyProgram {
    public static void main(String[] args) {
        OddThreads o1 = new OddThreads();
        Thread t1 = new Thread(new PrimeThreads());

        o1.start();
        t1.start();
    }
}
