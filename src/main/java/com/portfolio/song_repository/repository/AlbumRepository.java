package com.portfolio.song_repository.repository;

import com.portfolio.song_repository.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
