package com.theOfficeMemes.TheOfficeMemes.service;

import com.theOfficeMemes.TheOfficeMemes.DTO.Mapper.memesMapper;
import com.theOfficeMemes.TheOfficeMemes.DTO.memesDTO;
import com.theOfficeMemes.TheOfficeMemes.domain.memes;
import com.theOfficeMemes.TheOfficeMemes.repository.memesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class memeService implements ImemeService {

    private final memesRepository memesRepository;

    public memeService(com.theOfficeMemes.TheOfficeMemes.repository.memesRepository memesRepository) {
        this.memesRepository = memesRepository;
    }


    public memesDTO createMeme (memesDTO memesDTO){
        memes meme1 = memesMapper.mapToMemes(memesDTO);
        memesRepository.save(meme1);

        return memesMapper.mapToDTO(meme1);

    }

    public memesDTO findMemeByID (Long id){
        memes memes1 = memesRepository.findById(id).orElseThrow(() -> new RuntimeException("The office Meme not found"));

        memesDTO memeDTOFinal = memesMapper.mapToDTO(memes1);

        return memeDTOFinal;
    }

    public List<memesDTO> getAllMemes(){
        List<memes> memes = memesRepository.findAll();
        return memes.stream().map(memesMapper::mapToDTO).collect(Collectors.toList());
    }

    public String deleteMeme(Long id){
        memes memes1 = memesRepository.findById(id).orElseThrow(() -> new RuntimeException("The office Meme not found"));

        memesRepository.delete(memes1);

        return "Meme deleted with sucess";
    }

}
