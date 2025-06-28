package _6Arrays2.AutoBoxing;

public class Main {
    public static void main(String[] args) {

        // Integer autoBoxed = Integer.valueOf(15); // preferred but unnecessary
        // Integer deprecatedBoxing = new Integer(15); // deprecated since JDK 9
        // int unboxedInt = boxedInt.intValue(); // unnecessary

        // Automatic
        Integer autoBoxed = 15;
        int autoUnBoxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
        // System.out.println(autoUnBoxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

    }

    private static Double getDoubleObject() {

        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {

        return 100.00;
    }
}

