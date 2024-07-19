package com.TuneMusic.command;

import org.springframework.stereotype.Service;

@Service
public class CommandInvoker {

    public void executeCommand(Command command){
        command.execute();
    }
}
