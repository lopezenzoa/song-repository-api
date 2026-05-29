package com.portfolio.song_repository.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Genre")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @OneToMany(mappedBy = "genre")
    private List<Song> relatedSongs;
}
