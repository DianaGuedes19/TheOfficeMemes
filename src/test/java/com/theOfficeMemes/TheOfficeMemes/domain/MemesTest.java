package com.theOfficeMemes.TheOfficeMemes.domain;

import com.theOfficeMemes.TheOfficeMemes.data.listOfMemes;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class MemesTest {

    @Test
    public void shouldNotBeNullTheConstructor() {
        // Arrange
        Memes memes = new Memes(1L,"https://media1.giphy.com/media/v1.Y2lkPTc5MGI3NjExZDNxNXBrc2pwYzlnMmx2dGFwbnRvem84ZmxxYXl0YndmazgwN3dzOSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/oggFcS00sLvt1kTXqF/giphy.gif");

        // Act + Assert
        assertNotNull(memes);
    }

    @Test
    public void shouldNotBeNullTheConstructorWithNoValues() {
        // Arrange
        Memes memes = new Memes();

        // Act + Assert
        assertNotNull(memes);
    }

    @Test
    public void shouldNotCreateMemesWithNullValuesInURL() {
        // Arrange

        // Act + Assert
        assertThrows(Exception.class, () -> new Memes(1L,null));    }

    @Test
    public void shouldReturnTheValuesFromConstructorWithGetters() {
        // Arrange
        Memes memes = new Memes(1L,"https://media1.giphy.com/media/v1.Y2lkPTc5MGI3NjExZDNxNXBrc2pwYzlnMmx2dGFwbnRvem84ZmxxYXl0YndmazgwN3dzOSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/oggFcS00sLvt1kTXqF/giphy.gif");

        // Act
        Long id =  memes.getId();
        String url = memes.getUrl();

        //Assert
        assertEquals(memes.getId(),id);
        assertEquals(memes.getUrl(),url);
    }



}