package com.TuneMusic.command;

import com.TuneMusic.model.song;
import com.TuneMusic.service.SongService;

import java.util.List;

public class AddSongCommand implements Command{

    SongService service;
    song song;

    public AddSongCommand(SongService service,song song){
        this.service = service;
        this.song = song;
    }

    @Override
    public void execute(){
        service.save(song);
    }
}
