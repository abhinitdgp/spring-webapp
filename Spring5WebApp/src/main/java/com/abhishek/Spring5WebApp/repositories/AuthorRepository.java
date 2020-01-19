package com.abhishek.Spring5WebApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.abhishek.Spring5WebApp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
