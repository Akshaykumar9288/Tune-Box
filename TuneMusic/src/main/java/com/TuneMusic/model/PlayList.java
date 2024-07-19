package com.TuneMusic.model;


import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Entity
public class PlayList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "playList", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<song> songs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<song> getSongs() {
        return songs;
    }

    public void setSongs(List<song> songs) {
        this.songs = songs;
    }

    public void addSong(song song){
        this.songs.add(song);
    }

    public PlayList(Long id, String name, List<song> songs) {
        this.id = id;
        this.name = name;
        this.songs = songs;
    }

    public PlayList(){}

    @Override
    public String toString() {
        return "PlayList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", songs=" + songs +
                '}';
    }
}
