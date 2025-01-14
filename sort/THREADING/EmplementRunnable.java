package sort.THREADING;

public class EmplementRunnable {

  public static void main(String[] args) throws InterruptedException {

    Counter c = new Counter();

    Runnable printEitherGirlsOrBoys = () -> {
      for (int i = 0; i < 100; i++) {
        System.out.println("girks"+ "sdf");
        System.out.println(c.increment);
      }

    };

    Runnable PrintGirlsSits = () -> {
      System.out.println("Girl");
      System.out.println(c.increment);
    };

    Thread BOysThread = new Thread(printEitherGirlsOrBoys);

    Thread girlsThread = new Thread(PrintGirlsSits);

    BOysThread.start();
    girlsThread.start();

    try {
      BOysThread.start();
      girlsThread.start();

    } catch (Exception e) {

      e.printStackTrace();
    }

    System.out.println("the counter values is " + c.increment);

  }

}
