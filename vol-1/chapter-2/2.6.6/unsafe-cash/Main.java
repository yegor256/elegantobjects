import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Main {
  public static void main(String... args) {
    class Cash {
      private int dollars;
      private int cents;
      Cash(final int dlr, final int cts) {
        this.dollars = dlr;
        this.cents = cts;
      }
      @Override
      public String toString() {
        return String.format(
          "$%d.%d", this.dollars, this.cents
        );
      }
      public void mul(int factor) {
        this.dollars *= factor;
        this.cents *= factor;
      }
    }
    final Cash cash = new Cash(15, 10);
    final CountDownLatch start = new CountDownLatch(1);
    final Callable<Object> script = new Callable<Object>() {
      @Override
      public Object call() throws Exception {
        start.await(); // here
        cash.mul(2);
        System.out.println(cash);
        return null;
      }
    };
    final ExecutorService svc = Executors.newCachedThreadPool();
    svc.submit(script); // first thread
    svc.submit(script); // second thread
    start.countDown();
    svc.shutdown();
  }
}
