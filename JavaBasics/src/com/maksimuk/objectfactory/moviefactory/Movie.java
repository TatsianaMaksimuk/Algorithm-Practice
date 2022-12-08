package com.maksimuk.objectfactory.moviefactory;

public class Movie {
    private String title;
    private String director;
    private float runtimeInMin;
    private boolean hasBeenReleased;
    private short yearOfRelease;



    public Movie(String title, String director, float runtimeInMin, boolean hasBeenReleased, short yearOfRelease) {
        this.title = title;
        this.director = director;
        this.runtimeInMin = runtimeInMin;
        this.hasBeenReleased = hasBeenReleased;
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public float getRuntimeInMin() {
        return runtimeInMin;
    }

    public boolean isHasBeenReleased() {
        return hasBeenReleased;
    }

    public short getYearOfRelease() {
        return yearOfRelease;
    }

    @Override
    public String toString() {
        return "Movie: " + "\n" +
                "Title: " + title +
                ", director: " + director +
                ", runtime (min): " + runtimeInMin +
                ", has been released: " + hasBeenReleased +
                ", year of release: " + yearOfRelease;
    }

}
