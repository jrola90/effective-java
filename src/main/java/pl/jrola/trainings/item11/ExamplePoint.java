package pl.jrola.trainings.item11;

/**
 * Created by JrQ- on 2016-09-20.
 */
public class ExamplePoint {

    public static void main(String[] args) {

        Point A = new Point(1, 2);
        Point B = null;

        try {
            B = A.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Point A: " + A);
        System.out.println("Point B: " + B);
        System.out.println("Comparison: " + (A == B));


    }


}
