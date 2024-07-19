package com.TuneMusic.command;

import com.TuneMusic.model.PlayList;
import com.TuneMusic.model.song;
import com.TuneMusic.service.PlayListService;

public class CreatePlayListCommand implements Command{

    PlayListService service;
    PlayList list;
    song song;

    public CreatePlayListCommand(PlayListService service, PlayList list){
        this.service = service;
        this.list = list;
    }

    @Override
    public void execute() {
        service.CreatePlayList(list);
    }
}
