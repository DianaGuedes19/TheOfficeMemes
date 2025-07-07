package com.theOfficeMemes.TheOfficeMemes.DTO;

public class memesDTO {

    private Long id;
    private String url;

    // Constructor
    public memesDTO(Long id, String url) {
        this.id = id;
        this.url = url;
    }

    // Getters and Servers
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
