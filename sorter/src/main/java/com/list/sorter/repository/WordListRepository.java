package com.list.sorter.repository;

import com.list.sorter.model.WordList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WordListRepository extends JpaRepository<WordList, Integer> {
    Optional<WordList> findByItemName(String itemName);

    // Custom query to fetch all words from the database
    //@Query("SELECT l.listItem FROM List l")
    //WordList<String> findAllWords();
}