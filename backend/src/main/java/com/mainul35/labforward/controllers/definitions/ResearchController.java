package com.mainul35.labforward.controllers.definitions;

import com.mainul35.labforward.controllers.dtos.response.FrequencyResponse;
import com.mainul35.labforward.controllers.dtos.request.ResearchDto;
import com.mainul35.labforward.controllers.dtos.response.SimilarWordsResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Validated
@RequestMapping("/research")
public interface ResearchController {

    @GetMapping(value = "/frequency", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<FrequencyResponse> getFrequencies(@Valid @RequestBody ResearchDto researchDto);

    @GetMapping(value = "/similar-words", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<SimilarWordsResponse> getSimilarWords(@Valid @RequestBody ResearchDto researchDto);

}
