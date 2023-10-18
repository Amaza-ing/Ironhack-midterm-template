package com.ironhack.midtermtemplate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Collection {
    //    A primary key and some other properties
    @Id
    private Integer id;
    private String description;

    // ...
    // Other properties...
    // ...


    //    Empty constructor, getters & setters
    //    You can also use lombok annotations if you prefer
}
