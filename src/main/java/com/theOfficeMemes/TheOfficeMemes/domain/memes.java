package com.theOfficeMemes.TheOfficeMemes.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class memes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;

    // Constructor
    public memes(Long id, String url) {
        if (url == null || url.isBlank() || url.isEmpty()){
            throw new IllegalArgumentException("URL cannot be null or Empty");
        }
        this.id = id;
        this.url = url;
    }

    // Empty Constructor
    public memes() {
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
