package com.maksimuk.objectfactory.songfactory;

public class Song {


    private String title;
    private String artist;
    private String genre;
    private short seconds;


    public Song(String title, String artist, String genre, short seconds) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.seconds = seconds;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public short getSeconds() {
        return seconds;
    }


    @Override
    public String toString() {
        return "Song: " +
                "title: " + title +
                ", artist: " + artist +
                ", genre: " + genre +
                ", seconds" + seconds
                ;
    }


}