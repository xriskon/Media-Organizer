package main.java.media;

public class Series extends Media{
    private int seasons;
    private int[] seasonEpisodes;

    public Series(String title, int releaseDate, String[] providers, int seasons, int[] seasonEpisodes) {
        super(title, releaseDate, providers);
        this.seasons = seasons;
        this.seasonEpisodes = seasonEpisodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int[] getSeasonEpisodes() {
        return seasonEpisodes;
    }

    public void setSeasonEpisodes(int[] seasonEpisodes) {
        this.seasonEpisodes = seasonEpisodes;
    }
}
