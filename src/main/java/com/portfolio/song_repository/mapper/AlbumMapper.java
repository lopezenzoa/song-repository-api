package com.portfolio.song_repository.mapper;

import com.portfolio.song_repository.dto.AlbumDTO;
import com.portfolio.song_repository.model.Album;

import java.util.ArrayList;
import java.util.List;

public class AlbumMapper {
    public static AlbumDTO toDto(Album album) {
        return new AlbumDTO(
                album.getTitle(),
                AuthorMapper.toDto(album.getAuthor()),
                SongMapper.toDtoList(album.getListedSongs()),
                album.getReleaseDate()
        );
    }

    public static Album toEntity(AlbumDTO albumDTO) {
        Album entity = new Album();

        entity.setTitle(albumDTO.getTitle());
        entity.setAuthor(AuthorMapper.toEntity(albumDTO.getAuthor()));
        entity.setListedSongs(SongMapper.toEntityList(albumDTO.getListedSongs()));
        entity.setReleaseDate(albumDTO.getReleaseDate());

        return entity;
    }

    public static List<AlbumDTO> toDtoList(List<Album> albums) {
        List<AlbumDTO> albumDTOS = new ArrayList<>();

        albums.forEach(album -> albumDTOS.add(toDto(album)));

        return albumDTOS;
    }

    public static List<Album> toEntityList(List<AlbumDTO> albumDTOS) {
        List<Album> albums = new ArrayList<>();

        albumDTOS.forEach(albumDTO -> albums.add(toEntity(albumDTO)));

        return albums;
    }
}
