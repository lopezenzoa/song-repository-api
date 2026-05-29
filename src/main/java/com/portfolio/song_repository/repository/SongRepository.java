package com.portfolio.song_repository.repository;

import com.portfolio.song_repository.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
