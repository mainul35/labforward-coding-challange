package com.mainul35.labforward.controllers;

import com.mainul35.labforward.controllers.definitions.ResearchController;
import com.mainul35.labforward.controllers.dtos.request.ResearchDto;
import com.mainul35.labforward.controllers.dtos.response.FrequencyResponse;
import com.mainul35.labforward.controllers.dtos.response.SimilarWordsResponse;
import com.mainul35.labforward.services.ResearchService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ResearchControllerImpl implements ResearchController {

    private final ResearchService researchService;

    @Override
    public ResponseEntity<FrequencyResponse> getFrequencies(ResearchDto researchDto) {
        var frequencyResponse = researchService.getFrequencies(researchDto);
        return ResponseEntity.ok (frequencyResponse);
    }

    @Override
    public ResponseEntity<SimilarWordsResponse> getSimilarWords(ResearchDto researchDto) {
        var response = researchService.getSimilarWords(researchDto);
        return ResponseEntity.ok (response);
    }
}
