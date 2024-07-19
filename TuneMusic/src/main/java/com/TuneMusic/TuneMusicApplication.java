package com.TuneMusic;

import com.TuneMusic.command.AddSongCommand;
import com.TuneMusic.command.AddSongToPlayListCommand;
import com.TuneMusic.command.CommandInvoker;
import com.TuneMusic.command.CreatePlayListCommand;
import com.TuneMusic.model.PlayList;
import com.TuneMusic.model.song;
import com.TuneMusic.repository.SongRepository;
import com.TuneMusic.service.PlayListService;
import com.TuneMusic.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class TuneMusicApplication {

	@Autowired
	private CommandInvoker commandInvoker;
	@Autowired
	private SongService service;
	@Autowired
	private PlayListService playListService;

	public static void main(String[] args) {
		SpringApplication.run(TuneMusicApplication.class, args);

	}

	@Bean
	CommandLineRunner run(){
		return args -> {
			song song = new song();
			song.setTitle("Beatles");
			song.setGenre("Rock");
			song.setAlbum("Rockie");
			song.setArtist("Akshay");
			song song1 = new song();
			song1.setTitle("Puf");
			song1.setGenre("Love");
			song1.setAlbum("HumTum");
			song1.setArtist("Honey Singh");
			AddSongCommand addSongCommand = new AddSongCommand(service,song);
			AddSongCommand addSongCommand1 = new AddSongCommand(service,song1);
			commandInvoker.executeCommand(addSongCommand);
			commandInvoker.executeCommand(addSongCommand1);

			PlayList playList = new PlayList();
			playList.setName("Favorites");

			CreatePlayListCommand command = new CreatePlayListCommand(playListService,playList);
			commandInvoker.executeCommand(command);
			AddSongToPlayListCommand addSongToPlayListCommand = new AddSongToPlayListCommand(playListService, playList.getId(), Arrays.asList(song,song1));
			//commandInvoker.executeCommand(addSongToPlayListCommand);

		};
	}

}
