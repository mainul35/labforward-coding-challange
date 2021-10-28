package com.mainul35.labforward.services;

import com.mainul35.labforward.controllers.dtos.request.ResearchDto;
import com.mainul35.labforward.services.ResearchService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

@SpringBootTest
public class ResearchServiceTests {

    @Autowired
    private ResearchService researchService;

    private ResearchDto researchDto;

    @BeforeEach
    public void init() {
        this.researchDto = new ResearchDto ();
        researchDto.setGivenWord ("Word");
        researchDto.setNotebookEntry ("Word Word Word word");
    }

    @Test
    void testFrequencies() {
        var frequencies = researchService.getFrequencies (researchDto);
        Assertions.assertNotNull (frequencies, "Frequencies must not be empty");
        Assertions.assertEquals (3, frequencies.frequency (), "Frequencies will be 3 for the given data");
    }

    @Test
    void testSimilarWords() {
        var similarWords = researchService.getSimilarWords (researchDto);
        Assertions.assertNotNull (similarWords, "Similar words must not be empty");
        Assertions.assertEquals (Set.of ("word"), similarWords.similarWords (), "Words are similar");
    }

}
