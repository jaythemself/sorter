package com.list.sorter.service;

import com.list.sorter.model.WordList;

import java.util.List;

public interface IWordListService {
    WordList addWordList(WordList wordList);
    List<WordList> getWordList();
    WordList updateWordList(WordList wordList, int id);
    WordList getWordListById(int id);
    void deleteWordList(int id);
}
