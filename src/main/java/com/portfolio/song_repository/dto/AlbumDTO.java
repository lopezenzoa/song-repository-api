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
public class AlbumDTO {
    private String title;
    private AuthorDTO author;
    private List<SongDTO> listedSongs;
    private LocalDate releaseDate;
}
