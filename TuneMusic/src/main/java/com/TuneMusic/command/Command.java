package com.TuneMusic.command;

import com.TuneMusic.model.song;

import java.util.List;

public interface Command {

    void execute(song song);
}
