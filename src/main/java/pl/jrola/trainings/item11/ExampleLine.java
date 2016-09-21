package pl.jrola.trainings.item11;

/**
 * Created by JrQ- on 2016-09-21.
 */
public class ExampleLine {

    public static void main(String[] args) {

        Line l1 = new Line(new Point(1,2), new Point(3,4));
        Line l2 = null;

        try {
            l2 = l1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Line 1: " + l1);
        System.out.println("Line 2: " + l2);
        System.out.println("Comparison: " + (l1 == l2));
        System.out.println("Comparison of starting point: " + (l1.getStart() == l2.getStart()));
        System.out.println("Comparison of ending point: " + (l1.getEnd() == l2.getEnd()));

    }

}
