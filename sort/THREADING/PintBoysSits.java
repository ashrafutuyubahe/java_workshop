package sort.THREADING;

public class PintBoysSits implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("Girl");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {

        e.printStackTrace();
      }
    }

  }

  
}
