package main.java.media;

public abstract class Media {
    private String title;
    private int releaseDate;
    private String[] providers;

    public Media(String title, int releaseDate, String[] providers) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.providers = providers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String[] getProviders() {
        return providers;
    }

    public void setProviders(String[] providers) {
        this.providers = providers;
    }
}
