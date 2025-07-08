package com.theOfficeMemes.TheOfficeMemes.service;

import com.theOfficeMemes.TheOfficeMemes.DTO.Mapper.memesMapper;
import com.theOfficeMemes.TheOfficeMemes.DTO.memesDTO;
import com.theOfficeMemes.TheOfficeMemes.domain.memes;
import com.theOfficeMemes.TheOfficeMemes.repository.memesRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class memeServiceTest {
    @Mock
    private memesRepository memesRepository;

    @Mock
    private memesMapper memesMapper;

    @InjectMocks
    private memeService memesService;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createMeme() {
        // Arrange
        memesDTO inDto = new memesDTO(1L, "https://media1.giphy.com/.../oggFcS00sLvt1kTXqF/giphy.gif");

        memes toSave = new memes();

        memes saved = new memes(inDto.getId(),inDto.getUrl());

        when(memesRepository.save(toSave)).thenReturn(saved);

        // Act
        memesDTO outDto = memesService.createMeme(inDto);

        // Assert
        assertEquals(1L, outDto.getId());
        assertEquals(inDto.getUrl(), outDto.getUrl());
    }

    @Test
    void findMemeByID() {
    // Arrange
        memesDTO inDto = new memesDTO(1L, "https://media1.giphy.com/.../oggFcS00sLvt1kTXqF/giphy.gif");

        memes saved = new memes(inDto.getId(),inDto.getUrl());


        when(memesRepository.save(saved)).thenReturn(saved);


        when(memesRepository.findById(1L))
                .thenReturn(Optional.of(saved));

        memesDTO newDTO2 = memesMapper.mapToDTO(saved);

        // Act
        memesDTO result = memesService.findMemeByID(1L);

        // Assert
        assertEquals(1L, result.getId());
        assertEquals("https://media1.giphy.com/.../oggFcS00sLvt1kTXqF/giphy.gif", result.getUrl());
    }

    @Test
    void getAllMemes() {

        // Arrange
        memes e1 = new memes(); e1.setId(1L); e1.setUrl("u1");
        memes e2 = new memes(); e2.setId(2L); e2.setUrl("u2");

        when(memesRepository.findAll()).thenReturn(Arrays.asList(e1, e2));

        // Act
        List<memesDTO> all = memesService.getAllMemes();

        // Assert
        assertEquals(2, all.size());
        assertEquals(1L, all.get(0).getId());
        assertEquals(2L, all.get(1).getId());
    }

    @Test
    void deleteMeme() {

        // Arrange
        Long id = 5L;
        memes toDelete = new memes();
        toDelete.setId(id);
        toDelete.setUrl("any-url");
        when(memesRepository.findById(id))
                .thenReturn(Optional.of(toDelete));

        // Act
        String msg = memesService.deleteMeme(id);

        // Assert
        assertEquals("Meme deleted with sucess", msg);
    }
}