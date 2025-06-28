package _12ImmutableAndSealedClasses._1FinalExplored.consumer.specific;

import _12ImmutableAndSealedClasses._1FinalExplored.dev.lpa.generic.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {

        System.out.println("[Child:optionalMethod] EXTRA Stuff Here");
        super.optionalMethod();
    }

//    @Override
//    public void recommendedMethod() {
//
//        System.out.println("[Child:recommendedMethod]: I'll do things my way");
//        optionalMethod();
//    }

    private void mandatoryMethod() { // this is not overriding the method in the parent class; it is a new method in the child class. And it is not a hiddent method as bcoz it is not static.
        System.out.println("[Child:mandatoryMethod]: My own important stuff");
    }

    public static void recommendedStatic() { // this is a hidden method because it is static and it is not overriding the method in the parent class.

        System.out.println("[Child.recommendedStatic] BEST Way to Do it");
        optionalStatic();
//        mandatoryStatic(); // will cause compilation error because it is private in BaseClass
    }
}