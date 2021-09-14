package main.java.media;

import java.util.ArrayList;
import java.util.Date;

public abstract class Media {
    private static ArrayList<Media> media = new ArrayList<Media>();

    private String[] providerNames;
    private Date releaseDate;
    private String title;
    private int id;

    public static ArrayList<Media> getMedia() {
        return media;
    }

    public void addToMedia(Media newMedia) {
        media.add(newMedia);
    }
}
