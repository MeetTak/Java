package _12ImmutableAndSealedClasses._1FinalExplored;

import _12ImmutableAndSealedClasses._1FinalExplored.consumer.specific.ChildClass;
import _12ImmutableAndSealedClasses._1FinalExplored.dev.lpa.generic.BaseClass;

public class Main {
    public static void main(String[] args) {

        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferredToAsBase = new ChildClass(); // This is called upcasting; the object is of type ChildClass but the reference is of type BaseClass. And this is also called runtime polymorphism.

        parent.recommendedMethod();
        System.out.println("--------------------");
        childReferredToAsBase.recommendedMethod();
        System.out.println("--------------------");
        child.recommendedMethod();

        System.out.println("--------------------");
        parent.recommendedStatic();
        System.out.println("--------------------");
        childReferredToAsBase.recommendedStatic();
        System.out.println("--------------------");
        child.recommendedStatic();

        System.out.println("--------------------");
        BaseClass.recommendedStatic();
        ChildClass.recommendedStatic();

        String xArgument = "This is all I've got to say about Section ";
        StringBuilder zArgument = new StringBuilder("Only saying this: Section ");
        doXYZ(xArgument, 16, zArgument);
        System.out.println("After Method, xArgument: " + xArgument);
        System.out.println("After Method, zArgument: " + zArgument);

    }

    private static void doXYZ(String x, int y, final StringBuilder z) {

        final String c = x + y;
        System.out.println("c = " + c);
        x = c;
        z.append(y); // we can change the state of a final object.
        // z = new StringBuilder("This is a new reference"); // we cannot reintialize the final variable.
    }
}
