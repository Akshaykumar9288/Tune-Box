package com.TuneMusic.repository;


import com.TuneMusic.model.PlayList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayListRepository extends JpaRepository<PlayList,Long> {
}
