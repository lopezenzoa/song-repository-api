package com.portfolio.song_repository.controller;

import com.portfolio.song_repository.dto.GenreDTO;
import com.portfolio.song_repository.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/genres")
public class GenreController {
    @Autowired private GenreService service;

    @GetMapping("/")
    public ResponseEntity<List<GenreDTO>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<GenreDTO> add(@RequestBody GenreDTO body) {
        return ResponseEntity.ok(service.addGenre(body));
    }

    @GetMapping("/{title}")
    public ResponseEntity<Optional<GenreDTO>> getByTitle(@PathVariable String title) {
        return ResponseEntity.ok(service.getByTitle(title));
    }
}
