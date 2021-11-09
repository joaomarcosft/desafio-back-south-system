package br.com.desafiobackvoltossouthsystem.baundaries.associado.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Associado {

	private Integer idAssociado;

	private String nomeAssociado;

	private String cpfAssociado;

	@Builder.Default
	private Character autorizado = 'N';
}
