package com.abhishek.Spring5WebApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.abhishek.Spring5WebApp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
