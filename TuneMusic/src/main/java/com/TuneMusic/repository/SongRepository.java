package com.TuneMusic.repository;

import com.TuneMusic.model.song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<song,Long> {


}
