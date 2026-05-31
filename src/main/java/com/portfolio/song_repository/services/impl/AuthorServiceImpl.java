package com.portfolio.song_repository.services.impl;

import com.portfolio.song_repository.dto.AuthorDTO;
import com.portfolio.song_repository.exceptions.EmptyValueFieldException;
import com.portfolio.song_repository.exceptions.EntityNotFoundException;
import com.portfolio.song_repository.mapper.AuthorMapper;
import com.portfolio.song_repository.model.Author;
import com.portfolio.song_repository.repository.AuthorRepository;
import com.portfolio.song_repository.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired private AuthorRepository repository;

    @Override
    public AuthorDTO addAuthor(AuthorDTO authorDTO) throws EmptyValueFieldException {
        if (authorDTO.getName().isEmpty())
            throw new EmptyValueFieldException("THE NAME CAN'T BE BLANK");
        else if (authorDTO.getCountry().isEmpty())
            throw new EmptyValueFieldException("THE COUNTRY CAN'T BE BLANK");

        Author entity = AuthorMapper.toEntity(authorDTO);
        Author savedEntity = repository.save(entity);

        return AuthorMapper.toDto(savedEntity);
    }

    @Override
    public List<AuthorDTO> getAll() {
        return AuthorMapper.toDtoList(repository.findAll());
    }

    @Override
    public Optional<AuthorDTO> getByName(String name) {
        Optional<Author> authorOptional = repository.findByName(name.trim());

        if (authorOptional.isEmpty())
            throw new EntityNotFoundException("THE AUTHOR '" + name + "' DOESN'T EXIST");

        return authorOptional.map(AuthorMapper::toDto);
    }

    @Override
    public List<AuthorDTO> getByCountry(String country) {
        List<Author> authors = repository.findAllByCountry(country.trim());
        return AuthorMapper.toDtoList(authors);
    }
}
