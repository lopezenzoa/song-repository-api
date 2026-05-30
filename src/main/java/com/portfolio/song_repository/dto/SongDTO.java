package com.portfolio.song_repository.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SongDTO {
    private String title;
    @JsonIgnore private AlbumDTO album;
    @JsonIgnore private AuthorDTO author;
    @JsonIgnore private GenreDTO genre;
    private Integer duration;
    private LocalDate releaseDate;
}
