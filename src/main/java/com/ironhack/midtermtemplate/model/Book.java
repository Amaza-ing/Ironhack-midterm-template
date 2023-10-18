package com.ironhack.midtermtemplate.model;

import jakarta.persistence.*;

@Entity
public class Book {
    //    A primary key and some other properties
    @Id
    private Integer id;
    private String title;

    //    An embedded property (or a relationship with an entity with inheritance)
    @Embedded

    // ...
    // Other properties...
    // ...

    //    A relationship with other entity
    @ManyToOne
    @JoinColumn(name = "collection_id")
    private Collection collection;

    //    Empty constructor, getters & setters
    //    You can also use lombok annotations if you prefer
}
