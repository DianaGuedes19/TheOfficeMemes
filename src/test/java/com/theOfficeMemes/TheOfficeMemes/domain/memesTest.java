package com.theOfficeMemes.TheOfficeMemes.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class memesTest {

    @Test
    public void shouldNotBeNullTheConstructor() {
        // Arrange
        memes memes = new memes(1L,"https://media1.giphy.com/media/v1.Y2lkPTc5MGI3NjExZDNxNXBrc2pwYzlnMmx2dGFwbnRvem84ZmxxYXl0YndmazgwN3dzOSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/oggFcS00sLvt1kTXqF/giphy.gif");

        // Act + Assert
        assertNotNull(memes);
    }

    @Test
    public void shouldNotBeNullTheConstructorWithNoValues() {
        // Arrange
        memes memes = new memes();

        // Act + Assert
        assertNotNull(memes);
    }

    @Test
    public void shouldNotCreateMemesWithNullValuesInURL() {
        // Arrange

        // Act + Assert
        assertThrows(Exception.class, () -> new memes(1L,null));    }

    @Test
    public void shouldReturnTheValuesFromConstructorWithGetters() {
        // Arrange
        memes memes = new memes(1L,"https://media1.giphy.com/media/v1.Y2lkPTc5MGI3NjExZDNxNXBrc2pwYzlnMmx2dGFwbnRvem84ZmxxYXl0YndmazgwN3dzOSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/oggFcS00sLvt1kTXqF/giphy.gif");

        // Act
        Long id =  memes.getId();
        String url = memes.getUrl();

        //Assert
        assertEquals(memes.getId(),id);
        assertEquals(memes.getUrl(),url);
    }



}