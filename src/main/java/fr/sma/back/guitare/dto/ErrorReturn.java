package fr.sma.back.guitare.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorReturn {
    private String code;
    private String message;
}
