package pl.jrola.trainings.items68;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by JrQ- on 2016-11-06.
 */
public class Example {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // run tasks asynchronously
        executor.execute(new SampleBackgroundTask(1));
        executor.execute(new SampleBackgroundTask(2));
        executor.execute(new SampleBackgroundTask(3));

        // submit task to be run
        Future<?> future = executor.submit(new SampleBackgroundTask(4));

        // check if task is completed
        while(true) {
            System.out.println("Is task number 4 finished? : " + future.isDone());
            if(future.isDone())
                break;
        }

        // shutdown queue
        executor.shutdown();
    }

}