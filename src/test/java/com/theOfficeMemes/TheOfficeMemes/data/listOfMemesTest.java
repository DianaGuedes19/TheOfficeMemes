package com.theOfficeMemes.TheOfficeMemes.data;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class listOfMemesTest {

    @Test
    public void returnTheListOfMemes() {
        // Arrange
        List<String> actual = listOfMemes.listOfMemes();

        // Act
        String esperado0 = "https://media1.giphy.com/media/v1.Y2lkPTc5MGI3NjExYWNzbWN5Y3h2MnR1MjlmMWI0Y3dqNTlobjR2NHR0amcwa3lheW8xMSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/SbN0WomN4S7Z7tpKOC/giphy.gif";

        // Assert
        assertEquals(esperado0, actual.get(0));
        assertEquals(5,actual.size());
    }


}