package com.theOfficeMemes.TheOfficeMemes.service;

import com.theOfficeMemes.TheOfficeMemes.DTO.memesDTO;
import com.theOfficeMemes.TheOfficeMemes.repository.memesRepository;
import org.springframework.stereotype.Service;

@Service
public class memeService implements ImemeService {

    private final memesRepository memesRepository;

    public memeService(com.theOfficeMemes.TheOfficeMemes.repository.memesRepository memesRepository) {
        this.memesRepository = memesRepository;
    }

    /*
    public memesDTO createMeme (memesDTO memesDTO){

    }

     */
}
