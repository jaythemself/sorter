package com.list.sorter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WordList {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String itemName;

    //@OneToMany(mappedBy = "list", cascade = CascadeType.ALL)
    //private List;
}

// @NaturalId(mutable = true) is used to denote a piece of data CANNOT be valid for more than one entry.
// So for example if I had a list of employees and their emails, I could also set private String email with
// the @NaturalId() annotation to ensure no duplicates. (mutable = true) means that the entry can be edited.
