package com.devsuperior.dscatalog.resources.exception;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class StandardError {

    private Instant timestamp;
    private Integer status;
    private String error;
}
