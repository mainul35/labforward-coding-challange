package com.mainul35.labforward.controllers.dtos.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

//@Data
public class ResearchDto implements Serializable {

    @NotNull(message = "Given word must not be null")
    @NotBlank(message = "Given word must not be empty")
    private String givenWord;

    @NotNull(message = "Note book entry must not be null")
    @NotBlank(message = "Note book entry must not be empty")
    private String notebookEntry;

    public String getGivenWord() {
        return givenWord;
    }

    public void setGivenWord(String givenWord) {
        this.givenWord = givenWord;
    }

    public String getNotebookEntry() {
        return notebookEntry;
    }

    public void setNotebookEntry(String notebookEntry) {
        this.notebookEntry = notebookEntry;
    }
}
