package com.theOfficeMemes.TheOfficeMemes.service;

import com.theOfficeMemes.TheOfficeMemes.domain.Memes;
import com.theOfficeMemes.TheOfficeMemes.repository.memesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class memeService {

    private final memesRepository memesRepository;

    public memeService(com.theOfficeMemes.TheOfficeMemes.repository.memesRepository memesRepository) {
        this.memesRepository = memesRepository;
    }


}
