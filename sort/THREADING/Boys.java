package sort.THREADING;

public class Boys extends Thread {
    

  

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Boys");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
               e.printStackTrace();
            }

        }
    }
}
