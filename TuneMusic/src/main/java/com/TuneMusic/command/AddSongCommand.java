package com.TuneMusic.command;

import com.TuneMusic.model.song;
import com.TuneMusic.service.SongService;

import java.util.List;

public class AddSongCommand implements Command{

    SongService service;

    public AddSongCommand(SongService service){this.service = service;}

    @Override
    public void execute(song song){
        service.save(song);
    }
}
