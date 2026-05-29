package com.portfolio.song_repository.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Author")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id", nullable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String country;

    @Column(name = "first_release_date", nullable = false)
    private LocalDate firstReleaseDate;

    @OneToMany(mappedBy = "author")
    private List<Song> publishedSongs;

    @OneToMany(mappedBy = "author")
    private List<Album> publishedAlbums;
}
