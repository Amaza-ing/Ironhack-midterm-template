package com.ironhack.midtermtemplate.controller.impl;

import com.ironhack.midtermtemplate.controller.interfaces.IBookController;
import com.ironhack.midtermtemplate.repository.BookRepository;
import com.ironhack.midtermtemplate.service.interfaces.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController implements IBookController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    IBookService bookService;

//    @GetMapping
//    At least one GET method

//    @PostMapping
//    At least one POST method

//    @PutMapping
//    At least one PUT/PATCH method

//    @DeleteMapping
//    At least one DELETE method
}
