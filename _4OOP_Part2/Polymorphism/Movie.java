package _4OOP_Part2.Polymorphism;

public class Movie {

    private String title;

    public Movie(String title) {// this is a constructor
        this.title = title;
    }

    public void watchMovie() {// this is a method

        String instanceType = this.getClass().getSimpleName();// this line of code is getting the simple name of the class of the current instance and storing it in the instanceType variabe. For example, if the current instanc is of the Movie class, instanceTupe will be set to "Movie".
        // this.getClass(): Calls the getClass() method on the current instance, which returns the Class object representing the runtime class of the object.
        // getSimpleName(): Calls the getSimpleName() method on the Class object, which returns the simple name of the class as a String. The simple name is theclass name without the package name.
        System.out.println(title + " is a " + instanceType + " film");
    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);// basically it calls the Movie constructor to set the "title" field.
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }
}

class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending");
    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }
}
