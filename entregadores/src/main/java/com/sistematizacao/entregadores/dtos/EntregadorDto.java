package com.sistematizacao.entregadores.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EntregadorDto( @NotNull Integer cpf,
		@NotBlank String nome,
		@NotBlank String capacidade ) {
}


