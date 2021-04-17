import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class MyCallable implements Callable {
    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
}

public class CallableFutures {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future> futureList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Future submit = executor.submit(new MyCallable());
            futureList.add(submit);
        }
        executor.shutdown();
        int sum = 0;
        // Now retrieve the result
        for (Future future : futureList) {
            sum+= (Integer) future.get();
        }
        System.out.println(sum);
    }
}