package com.list.sorter.controller;

import com.list.sorter.model.WordList;
import com.list.sorter.service.IWordListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

import java.util.List;

@RestController
@RequestMapping("/words")
@RequiredArgsConstructor
public class WordListController {
    private final IWordListService wordListService;

    @GetMapping
    public ResponseEntity<List<WordList>> getWordList() {
        return new ResponseEntity<>(wordListService.getWordList(), HttpStatus.FOUND);
    }

    @PostMapping
    public WordList addWordList(@RequestBody WordList wordList){
        return wordListService.addWordList(wordList);
    }

    @PutMapping("/update/{id}")
    public WordList updateWordList(@RequestBody WordList wordList, @PathVariable int id) {
        return wordListService.updateWordList(wordList, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteWordList(@PathVariable int id){
        wordListService.deleteWordList(id);
    }

    @GetMapping("/words/{id}")
    public WordList getWordListById(@PathVariable int id) {
        return wordListService.getWordListById(id);
    }
}
