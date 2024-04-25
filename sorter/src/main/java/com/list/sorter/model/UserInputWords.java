package com.list.sorter.model;

import jakarta.persistence.*;

@Entity
public class UserInputWords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String word;

    @ManyToOne
    @JoinColumn(name = "word_list_id", nullable = false)
    private WordList list;

    //constructors/getters/setters
}
