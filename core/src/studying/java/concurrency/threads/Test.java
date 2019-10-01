package studying.java.concurrency.threads;

/**
 * Created by echaika on 08.07.2019
 */
class User extends Thread{
    @Override
    public void run() {
        System.out.println("Thread - " + Thread.currentThread() + ", priority - " + Thread.currentThread().getPriority());
    }
}


class Test {
    public static void main(String[] args) {
        User first = new User();
        first.setPriority(3);
        User second = new User();
        second.setPriority(Thread.MAX_PRIORITY);
        User third = new User();
        third.setPriority(Thread.MIN_PRIORITY);
        User forth = new User();
        forth.setPriority(Thread.NORM_PRIORITY);

        Thread[] arr = new Thread[]{first, third, second, forth};

        for (Thread thread : arr) {
            thread.start();
        }
    }
}
