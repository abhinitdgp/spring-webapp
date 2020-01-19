package com.abhishek.Spring5WebApp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.abhishek.Spring5WebApp.model.*;
import com.abhishek.Spring5WebApp.repositories.*;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;

	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		// TODO Auto-generated constructor stub
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	public void initData() {
		Author chetan = new Author("Chetan", "Bhagat");
		Publisher times = new Publisher("Times", "Bengaluru,India");
		Book states = new Book("2 States", "12345", times);
		chetan.getBooks().add(states);
		states.getAuthors().add(chetan);

		publisherRepository.save(times);
		authorRepository.save(chetan);
		bookRepository.save(states);

		Author au = new Author("Eric", "Evans");
		Publisher collins = new Publisher("Collins", "California, USA");
		Book bk = new Book("Domain Driven Design", "1234", collins);
		
		au.getBooks().add(bk);
		bk.getAuthors().add(au);

		authorRepository.save(au);
		publisherRepository.save(collins);
		bookRepository.save(bk);

	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		initData();
	}
}
