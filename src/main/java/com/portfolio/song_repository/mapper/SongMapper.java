package com.portfolio.song_repository.mapper;

import com.portfolio.song_repository.dto.SongDTO;
import com.portfolio.song_repository.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongMapper {
    public static SongDTO toDto(Song song) {
        SongDTO songDTO = new SongDTO();

        song.setTitle(song.getTitle());
        song.setDuration(song.getDuration());
        song.setReleaseDate(song.getReleaseDate());

        return songDTO;
    }

    public static Song toEntity(SongDTO songDTO) {
        Song entity = new Song();

        entity.setTitle(songDTO.getTitle().trim().toUpperCase());
        entity.setDuration(songDTO.getDuration());
        entity.setReleaseDate(songDTO.getReleaseDate());

        return entity;
    }

    public static List<SongDTO> toDtoList(List<Song> songs) {
        List<SongDTO> songDTOS = new ArrayList<>();

        songs.forEach(song -> songDTOS.add(toDto(song)));

        return songDTOS;
    }

    public static List<Song> toEntityList(List<SongDTO> songDTOS) {
        List<Song> songs = new ArrayList<>();

        songDTOS.forEach(songDTO -> songs.add(toEntity(songDTO)));

        return songs;
    }
}
