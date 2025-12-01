class Even_num extends Thread{
    public void run() {
        int i;

        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    }
}

class Natrual_num extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Natural number: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThread2 
{
    
}
