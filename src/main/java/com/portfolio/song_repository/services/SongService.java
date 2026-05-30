package com.portfolio.song_repository.services;

import com.portfolio.song_repository.dto.SongDTO;

import java.util.List;
import java.util.Optional;

public interface SongService {
    SongDTO addSong(SongDTO songDTO);
    List<SongDTO> getAll();
    List<SongDTO> getByAlbumTitle(String albumTitle);
    List<SongDTO> getByAuthorName(String authorName);
    List<SongDTO> getByGenreTitle(String genreTitle);

    Optional<SongDTO> getByTitle(String title);
}
