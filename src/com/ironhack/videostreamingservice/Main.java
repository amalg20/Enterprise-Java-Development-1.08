package com.ironhack.videostreamingservice;


public class Main {
    public static void main(String[] args){
        TvSeries tvSeries = new TvSeries("Amal", 120, 30);
        System.out.println(tvSeries.getInfo());
        Movie movie = new Movie("Alaa", 90, 8.50);
        System.out.println(movie.getInfo());


    }
}
