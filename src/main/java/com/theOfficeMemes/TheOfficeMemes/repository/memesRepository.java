package com.theOfficeMemes.TheOfficeMemes.repository;

import com.theOfficeMemes.TheOfficeMemes.domain.Memes;
import org.springframework.data.jpa.repository.JpaRepository;


public interface memesRepository extends JpaRepository<Memes,Long> {
}
