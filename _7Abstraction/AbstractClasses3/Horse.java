package _7Abstraction.AbstractClasses3;

public class Horse extends Mammal {

    public Horse(String type, String size, double weitght) {
        super(type, size, weitght);
    }

    @Override
    public void shedHair() {

        System.out.println(getExplicitType() + " shed in the spring");
    }

    @Override
    public void makeNoise() {

    }
}
