class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(500); // Sleep for half a second
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class PrimeThread implements Runnable {
    public void run() {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println("Prime: " + i);
                try {
                    Thread.sleep(1000); // Sleep for one second
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Program13 {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        PrimeThread primeRunnable = new PrimeThread();
        Thread primeThread = new Thread(primeRunnable);

        oddThread.start();
        primeThread.start();
    }
}
