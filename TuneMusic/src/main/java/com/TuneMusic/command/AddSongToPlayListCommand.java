package com.TuneMusic.command;

import com.TuneMusic.service.PlayListService;

public class AddSongToPlayListCommand implements Command{

    PlayListService service;
    Long playlistId;
    Long songId;

    public AddSongToPlayListCommand(PlayListService service, Long playlistId, Long songId) {
        this.service = service;
        this.playlistId = playlistId;
        this.songId = songId;
    }


    @Override
    public void execute() {
        service.addSongToPlayList(playlistId,songId);
    }
}
