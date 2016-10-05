package pl.jrola.trainings.item30;

/**
 * Created by JrQ- on 2016-10-05.
 */
public class Example {

    public static void main(String[] args) {

        for(Operation op : Operation.values()) {
            System.out.println(op + " => " + op.apply(2,1));
        }

    }

}
