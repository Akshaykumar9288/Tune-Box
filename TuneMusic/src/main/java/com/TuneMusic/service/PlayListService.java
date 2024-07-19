package com.TuneMusic.service;


import com.TuneMusic.model.PlayList;
import com.TuneMusic.model.song;
import com.TuneMusic.repository.PlayListRepository;


public class PlayListService {

    PlayListRepository repository;
    SongService service;

    public PlayListService(PlayListRepository repository, SongService service){
        this.repository = repository;
        this.service = service;
    }

    public PlayList CreatePlayList(PlayList list){
        return repository.save(list);
    }

    public PlayList getPlaylistById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void addSongToPlayList(Long playlistId, Long songId){
        PlayList list = getPlaylistById(playlistId);
        song song = service.getSongById(songId);

        if (list != null && song != null ){
            list.addSong(song);
            repository.save(list);
        }
    }

    public void deletePlayList(Long PlayListId){
        repository.deleteById(PlayListId);
    }

    public void deleteSongFromPlayList(Long PlayListId, Long SongId){
        PlayList list = getPlaylistById(PlayListId);
        song song = service.getSongById(SongId);
        if (list != null && song != null){
            list.getSongs().remove(song);
            repository.save(list);
        }
    }
}
