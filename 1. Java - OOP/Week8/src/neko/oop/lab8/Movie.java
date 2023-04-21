package neko.oop.lab8;

public class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public int compareTo(Movie movie) {
        return movie.getYear() - this.getYear();
    }
}
