package com.example.demo.Service;


import com.example.demo.Entities.Author;
import com.example.demo.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    @PreAuthorize("hasRole('ADMIN')")
    public Author getAuthorById (Long authorId) {return authorRepository.findById(authorId).orElse(null);}

    @PreAuthorize("hasRole('ADMIN')")
    public Author saveAuthor (Author author) {return authorRepository.save(author);  }

    @PreAuthorize("hasRole('ADMIN')")
    public Author deleteAuthor (Long authorId) {return authorRepository.delete(authorId);}

}
