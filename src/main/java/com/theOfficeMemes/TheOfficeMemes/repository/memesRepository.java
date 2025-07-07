package com.theOfficeMemes.TheOfficeMemes.repository;

import com.theOfficeMemes.TheOfficeMemes.domain.memes;
import org.springframework.data.jpa.repository.JpaRepository;


public interface memesRepository extends JpaRepository<memes,Long> {
}
