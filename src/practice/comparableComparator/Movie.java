package practice.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Movie implements Comparable<Movie> {

    private int year;
    private String name;
    private Date date;

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Movie(int year, String name, Date date) {
        this.year = year;
        this.name = name;
        this.date = date;
    }

    @Override
    public int compareTo(Movie m) {
        return this.name.compareTo(m.name);
    }
}

class MainComparator {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1996, "Movie2", new Date(1991, 8, 20)));
        movies.add(new Movie(1990, "Movie1", new Date(1990, 11, 19)));
        movies.add(new Movie(1994, "Movie3", new Date(1991, 7, 21)));
        Collections.sort(movies);
        System.out.println("Movies after sorting by year:");
        for (Movie m : movies) {
            System.out.println(m.getName() + " " + m.getYear() + " " + m.getDate());
        }
    }
}
