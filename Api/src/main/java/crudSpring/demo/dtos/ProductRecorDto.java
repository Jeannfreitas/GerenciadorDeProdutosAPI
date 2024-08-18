package crudSpring.demo.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRecorDto(@NotBlank String nomeProduto, @NotNull BigDecimal valor ) {
}
