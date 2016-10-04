package pl.jrola.trainings.item22;

/**
 * Created by JrQ- on 2016-09-22.
 */
public class OuterClass {

    private int a = 1;
    private static int b = 2;

    public static class InnerStaticClass {

        private int c = 3;

        private void testInnerStaticClass() {

            // It will not compile - we cannot access non static attributes from static context
            // System.out.println(OuterClass.this.a);

            System.out.println(b);
            System.out.println(c);
        }
    }

    public class InnerClass {

        private int d = 4;

        private void testInnerClass() {

            System.out.println(OuterClass.this.a);
            System.out.println(OuterClass.b); // or just System.out.println(b);
            System.out.println(d);

        }

    }

}