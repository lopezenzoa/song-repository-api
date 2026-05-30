package com.portfolio.song_repository.services;

import com.portfolio.song_repository.dto.AlbumDTO;

import java.util.List;
import java.util.Optional;

public interface AlbumService {
    AlbumDTO addAlbum(AlbumDTO albumDTO);
    List<AlbumDTO> getAll();
    Optional<AlbumDTO> getByName();
}
