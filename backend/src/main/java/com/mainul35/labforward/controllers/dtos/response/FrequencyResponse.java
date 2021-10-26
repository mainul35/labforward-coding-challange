package com.mainul35.labforward.controllers.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class FrequencyResponse implements Serializable {
    private Long frequency;
}
