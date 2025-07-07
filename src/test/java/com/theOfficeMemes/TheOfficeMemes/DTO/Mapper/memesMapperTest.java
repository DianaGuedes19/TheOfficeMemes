package com.theOfficeMemes.TheOfficeMemes.DTO.Mapper;

import com.theOfficeMemes.TheOfficeMemes.DTO.memesDTO;
import com.theOfficeMemes.TheOfficeMemes.domain.memes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class memesMapperTest {

    @Test
    public void shouldMapDTOAndReturnDomain() {
        // Arrange
        memesDTO memesDTO = new memesDTO(1L,"https://media1.giphy.com/media/v1.Y2lkPTc5MGI3NjExZDNxNXBrc2pwYzlnMmx2dGFwbnRvem84ZmxxYXl0YndmazgwN3dzOSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/oggFcS00sLvt1kTXqF/giphy.gif");

        // Act
        memes memes = memesMapper.mapToMemes(memesDTO);


        //Assert
        assertEquals(memes.getId(),memesDTO.getId());
        assertEquals(memes.getUrl(),memesDTO.getUrl());
    }

    @Test
    public void shouldMapDomainAndReturnDTO() {
        // Arrange
        memes memes = new memes(1L,"https://media1.giphy.com/media/v1.Y2lkPTc5MGI3NjExZDNxNXBrc2pwYzlnMmx2dGFwbnRvem84ZmxxYXl0YndmazgwN3dzOSZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/oggFcS00sLvt1kTXqF/giphy.gif");

        // Act
        memesDTO memesDTO = memesMapper.mapToDTO(memes);


        //Assert
        assertEquals(memes.getId(),memesDTO.getId());
        assertEquals(memes.getUrl(),memesDTO.getUrl());
    }

}