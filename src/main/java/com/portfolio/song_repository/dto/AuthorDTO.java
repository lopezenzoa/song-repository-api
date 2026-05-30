package com.portfolio.song_repository.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AuthorDTO {
    private String name;
    private String country;
    private LocalDate firstReleaseDate;
    private List<SongDTO> publishedSongs;
    private List<AlbumDTO> publishedAlbums;
}
