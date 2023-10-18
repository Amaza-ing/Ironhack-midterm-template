package com.ironhack.midtermtemplate.controller.impl;

import com.ironhack.midtermtemplate.controller.interfaces.ICollectionController;
import com.ironhack.midtermtemplate.repository.CollectionRepository;
import com.ironhack.midtermtemplate.service.interfaces.ICollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollectionController implements ICollectionController {

    @Autowired
    CollectionRepository collectionRepository;

    @Autowired
    ICollectionService collectionService;

//    @GetMapping
//    At least one GET method

//    @PostMapping
//    At least one POST method

//    @PutMapping
//    At least one PUT/PATCH method

//    @DeleteMapping
//    At least one DELETE method
}
