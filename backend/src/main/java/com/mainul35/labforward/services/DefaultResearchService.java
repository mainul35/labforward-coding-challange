package com.mainul35.labforward.services;

import com.mainul35.labforward.controllers.dtos.request.ResearchDto;
import com.mainul35.labforward.controllers.dtos.response.FrequencyResponse;
import com.mainul35.labforward.controllers.dtos.response.SimilarWordsResponse;
import com.mainul35.labforward.util.LevenshteinDistanceUtil;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DefaultResearchService implements ResearchService {
    @Override
    public FrequencyResponse getFrequencies(ResearchDto researchDto) {
        var frequencies = getAllWordsAsStream (researchDto.getNotebookEntry ())
                .filter (s -> s.equals (researchDto.getGivenWord ())).count ();
        return new FrequencyResponse (frequencies);
    }

    @Override
    public SimilarWordsResponse getSimilarWords(ResearchDto researchDto) {
        var words = getAllWordsAsStream (researchDto.getNotebookEntry ())
                .filter (s -> LevenshteinDistanceUtil.isWithinLevenshteinDistanceBounds (researchDto.getGivenWord (), s))
                .collect(Collectors.toSet());
        return new SimilarWordsResponse (words);
    }

    private Stream<String> getAllWordsAsStream(String line) {
        return Arrays.stream (line.split ("\\s+"));
    }
}
