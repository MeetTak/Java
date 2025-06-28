package _4OOP_Part2.Polymorphism3;

public class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");// if i use C instead of A, it will throw an error that class Comedy cannot be cast to class Adventure.
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();
    }
}