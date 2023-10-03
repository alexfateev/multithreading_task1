public class MyThread extends Thread{


    public MyThread(String s, ThreadGroup mainGroup) {
        super(mainGroup, s);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("Я %s. Всем привет!\n", getName());
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
