package pl.jrola.trainings.item22;

/**
 * Created by JrQ- on 2016-10-04.
 */
public class Example {

    public static void main(String[] args) {

        // creating instance of outer class
        OuterClass outerClass = new OuterClass();

        // creating instance of nested class - we need an instance of OuterClass
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass);

        // creating instance of static nested class - we do not need OuterClass instance
        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
        System.out.println(innerStaticClass);
    }

}
