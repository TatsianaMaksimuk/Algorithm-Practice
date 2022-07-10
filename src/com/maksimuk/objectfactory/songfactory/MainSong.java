package com.maksimuk.objectfactory.songfactory;

import com.maksimuk.objectfactory.FactoryUI;

public class MainSong {
    public static void main(String[] args) {
        String title = FactoryUI.readString("What is the title of the song?");
        String artist = FactoryUI.readString("Who is the artist?");
        String genre = FactoryUI.readString("What is the genre?");
        short seconds = FactoryUI.readShort("What is the duration of the song in seconds?", (short) 0, (short) 10000);


    }
}
