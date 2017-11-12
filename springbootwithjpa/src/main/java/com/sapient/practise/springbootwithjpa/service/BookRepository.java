package com.sapient.practise.springbootwithjpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.practise.springbootwithjpa.domain.Book;


public interface BookRepository extends JpaRepository<Book,Long> {

}
