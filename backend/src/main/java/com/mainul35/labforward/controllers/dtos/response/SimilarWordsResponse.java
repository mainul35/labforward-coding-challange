package com.mainul35.labforward.controllers.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
public class SimilarWordsResponse implements Serializable {
    private Set<String> similarWords;
}
