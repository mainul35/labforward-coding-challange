package com.mainul35.labforward.services;

import com.mainul35.labforward.controllers.dtos.request.ResearchDto;
import com.mainul35.labforward.controllers.dtos.response.FrequencyResponse;
import com.mainul35.labforward.controllers.dtos.response.SimilarWordsResponse;

public interface ResearchService {

    FrequencyResponse getFrequencies(ResearchDto researchDto);

    SimilarWordsResponse getSimilarWords(ResearchDto researchDto);
}
