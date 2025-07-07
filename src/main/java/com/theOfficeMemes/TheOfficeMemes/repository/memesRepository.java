package com.theOfficeMemes.TheOfficeMemes.repository;

import com.theOfficeMemes.TheOfficeMemes.domain.Memes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface memesRepository extends JpaRepository<Memes,Long> {
    List<Memes> getByID(Long id);
}
