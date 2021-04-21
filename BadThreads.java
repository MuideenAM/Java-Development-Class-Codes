public class BadThreads {

    static volatile String message;

    private static class CorrectorThread
        extends Thread {

        public void run() {
            try {
                System.out.println("CorrectorThread Entered now.");
                sleep(1000); 
            } catch (InterruptedException e) {}
            // Key statement 1:
            message = "Mares do eat oats."; 
        }
    }

    private static synchronized String getMessage(String msg) {
      return msg;
    }

    public static void main(String args[])
        throws InterruptedException {
        
        CorrectorThread ct = new CorrectorThread();
        ct.start();
        //ct.join();
        message = "Mares do not eat oats.";
        System.out.println("Just before my sleep");
        Thread.sleep(2000);
        // Key statement 2:
        System.out.println(message);
    }
}