package com.TuneMusic.service;

import com.TuneMusic.model.song;
import com.TuneMusic.repository.SongRepository;
import org.springframework.stereotype.Service;

@Service
public class SongService {

    SongRepository repository;

    public SongService(SongRepository repository) {
        this.repository = repository;
    }

    public song save(song song) {
        return repository.save(song);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public song getSongById(Long songId) {
        return repository.findById(songId).orElse(null);
    }
}
