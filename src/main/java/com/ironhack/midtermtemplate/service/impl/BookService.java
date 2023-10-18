package com.ironhack.midtermtemplate.service.impl;

import com.ironhack.midtermtemplate.repository.BookRepository;
import com.ironhack.midtermtemplate.service.interfaces.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {

    @Autowired
    BookRepository bookRepository;

//    Implement here the methods that have some logic in the controller
//    So we can leave the controller as clean as possible
}
