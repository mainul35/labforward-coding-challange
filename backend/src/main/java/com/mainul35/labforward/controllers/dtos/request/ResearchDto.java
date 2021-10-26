package com.mainul35.labforward.controllers.dtos.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResearchDto implements Serializable {
    private String givenWord;
    private String notebookEntry;
}
