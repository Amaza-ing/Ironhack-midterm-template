package com.ironhack.midtermtemplate.service.impl;

import com.ironhack.midtermtemplate.repository.CollectionRepository;
import com.ironhack.midtermtemplate.service.interfaces.ICollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectionService implements ICollectionService {

    @Autowired
    CollectionRepository collectionRepository;

//    Implement here the methods that have some logic in the controller
//    So we can leave the controller as clean as possible
}
