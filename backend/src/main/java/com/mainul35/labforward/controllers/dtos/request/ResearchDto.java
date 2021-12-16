package com.mainul35.labforward.controllers.dtos.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public record ResearchDto (
        @NotNull(message = "Given word must not be null")
        @NotBlank(message = "Given word must not be empty")
        String givenWord,
        @NotNull(message = "Note book entry must not be null")
        @NotBlank(message = "Note book entry must not be empty")
        String notebookEntry
){}
