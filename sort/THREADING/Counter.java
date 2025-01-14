package sort.THREADING;

public class Counter {

    int counter;
    public String increment;
  

    public synchronized void  increment() {
        counter++;
    }

}
