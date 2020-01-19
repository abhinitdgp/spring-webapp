package com.abhishek.Spring5WebApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.abhishek.Spring5WebApp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {

}
