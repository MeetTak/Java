package _6Arrays2.EnumProject2;

public enum Topping {
    
    MUSTARD, 
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO; // semicolon is used to separate the enum constants from the methods

    public double getPrice() {

        return switch (this) {
            case BACON -> 1.5;
            case CHEDDAR -> 1.0;
            default -> 0.0;
        };
     }
}
