package com.theOfficeMemes.TheOfficeMemes.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Memes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;

    // Constructor
    public Memes(Long id, String url) {
        if (url == null || url.isBlank() || url.isEmpty()){
            throw new IllegalArgumentException("URL cannot be null or Empty");
        }
        this.id = id;
        this.url = url;
    }

    // Empty Constructor
    public Memes() {
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }
}
