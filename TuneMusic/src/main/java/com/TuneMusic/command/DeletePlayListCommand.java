package com.TuneMusic.command;

import com.TuneMusic.model.PlayList;
import com.TuneMusic.service.PlayListService;

public class DeletePlayListCommand implements Command{
    PlayList list;
    PlayListService service;

    public DeletePlayListCommand(PlayListService service, PlayList list) {
        this.service = service;
        this.list = list;
    }

    @Override
    public void execute() {
        service.deletePlayList(list.getId());
    }
}
