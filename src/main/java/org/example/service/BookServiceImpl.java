package org.example.service;

import org.example.model.Book;
import org.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    private static int count = 0;

    @Override
    public void addBook() {
        bookRepository.save(new Book("Книга" + count++, 120.0+count));
    }
}
