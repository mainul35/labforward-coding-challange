package com.mainul35.labforward.controllers.definitions;

import com.mainul35.labforward.controllers.dtos.response.FrequencyResponse;
import com.mainul35.labforward.controllers.dtos.request.ResearchDto;
import com.mainul35.labforward.controllers.dtos.response.SimilarWordsResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/research")
public interface ResearchController {

    @GetMapping(value = "/frequency", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<FrequencyResponse> getFrequencies(@RequestBody ResearchDto researchDto);

    @GetMapping(value = "/similar-words", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<SimilarWordsResponse> getSimilarWords(@RequestBody ResearchDto researchDto);

}
