package com.ironhack.midtermtemplate.repository;

import com.ironhack.midtermtemplate.model.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionRepository extends JpaRepository<Collection, Integer> {

    // You can add custom JPA queries methods if you need them

    // Generate tests (just a couple of them would be fine)

}
