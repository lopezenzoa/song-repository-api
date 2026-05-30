package com.portfolio.song_repository.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GenreDTO {
    private String title;
    private List<SongDTO> relatedSongs;
}
