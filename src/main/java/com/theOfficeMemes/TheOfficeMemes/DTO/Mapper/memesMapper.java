package com.theOfficeMemes.TheOfficeMemes.DTO.Mapper;

import com.theOfficeMemes.TheOfficeMemes.DTO.memesDTO;
import com.theOfficeMemes.TheOfficeMemes.domain.memes;

public class memesMapper {

    public static memesDTO mapToDTO (memes memes){
        memesDTO memesDTO = new memesDTO();

        memesDTO.setId(memes.getId());
        memesDTO.setUrl(memes.getUrl());

        return memesDTO;
    }

    public static memes mapToMemes(memesDTO memesDTO){
        memes memes = new memes();

        memes.setId(memesDTO.getId());
        memes.setUrl(memesDTO.getUrl());

        return memes;
    }

}
