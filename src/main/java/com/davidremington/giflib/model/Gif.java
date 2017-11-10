package com.davidremington.giflib.model;

import java.time.LocalDate;

public class Gif {
    private String name;
    private int catergoryId;
    private LocalDate dateUploaded;
    private String username;
    private boolean favorite;

    public Gif(String name, int catergoryId, LocalDate dateUploaded, String username, boolean favorite) {
        this.name = name;
        this.catergoryId = catergoryId;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
    }

    public int getCatergoryId() {
        return catergoryId;
    }

    public void setCatergoryId(int catergoryId) {
        this.catergoryId = catergoryId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
