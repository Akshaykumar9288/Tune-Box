package com.TuneMusic.command;

import com.TuneMusic.model.song;
import com.TuneMusic.service.SongService;

public class DeleteSongCommand implements Command{

    SongService service;
    song song;
    public DeleteSongCommand(SongService service,song song) {
        this.service = service;
        this.song = song;
    }

    @Override
    public void execute(){
        service.delete(song.getId());
    }
}
