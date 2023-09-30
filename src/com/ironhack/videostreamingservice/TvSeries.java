package com.ironhack.videostreamingservice;

public class TvSeries extends Video{
    private int episodes;
    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }
    public int getEpisodes() {
        return episodes;
    }
    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
    @Override String getInfo()
    {
        return "Tv Series \n Title : " + super.getTitle() + " Duration : " + super.getDuration() + " Number of Episodes : " + this.episodes ;
    }
}


