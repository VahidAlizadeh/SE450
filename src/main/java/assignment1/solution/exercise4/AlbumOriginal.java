/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package assignment1.solution.exercise4;

public class AlbumOriginal {
    private String ismn;
    private String title;
    private String artist;
    private String genre;
    private String price;
    public AlbumOriginal(String ismn, String title, String artist, String genre, String price) {
        setIsmn(ismn);
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setPrice(price);
    }
    public String getIsmn() {
        return ismn;
    }
    public void setIsmn(String ismn) {
        this.ismn = ismn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}