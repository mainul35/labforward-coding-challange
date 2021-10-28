package com.mainul35.labforward.controllers.definitions;

import com.mainul35.labforward.controllers.dtos.request.ResearchDto;
import com.mainul35.labforward.controllers.dtos.response.FrequencyResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RequestMapping("/research")
@CrossOrigin(origins = "${cross.origin}")
public interface ResearchController {

    @PostMapping(value = "/frequency", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<FrequencyResponse> getFrequencies(@Valid @RequestBody ResearchDto researchDto);

    @PostMapping(value = "/similar-words", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> getSimilarWords(@Valid @RequestBody ResearchDto researchDto);

}
