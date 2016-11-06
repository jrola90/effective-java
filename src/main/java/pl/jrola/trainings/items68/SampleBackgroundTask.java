package pl.jrola.trainings.items68;

/**
 * Created by JrQ- on 2016-11-06.
 */
public class SampleBackgroundTask implements Runnable {

    private int taskNumber;

    public SampleBackgroundTask(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public void run() {
        System.out.println("Executing task number: " + taskNumber);
    }
}
