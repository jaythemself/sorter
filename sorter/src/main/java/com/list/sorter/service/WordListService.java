package com.list.sorter.service;

import com.list.sorter.exception.WordListAlreadyExistsException;
import com.list.sorter.model.WordList;
import com.list.sorter.repository.WordListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WordListService implements IWordListService{

    private final WordListRepository wordListRepository;
    @Override
    public List<WordList> getWordList() {
        return wordListRepository.findAll();
    }

    @Override
    public WordList addWordList(WordList wordList) {
        if (wordListAlreadyExists(wordList.getItemName())){
            throw new WordListAlreadyExistsException("Item is already added to the list!");
        }
        return wordListRepository.save(wordList);
    }

    @Override
    public WordList updateWordList(WordList wordList, int id) {
        return null;
    }

    @Override
    public WordList getWordListById(int id) {
        return null;
    }

    @Override
    public void deleteWordList(int id) {

    }

    private boolean wordListAlreadyExists(String itemName) {
        return wordListRepository.findByItemName(itemName).isPresent();
    }

}
