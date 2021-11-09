package br.com.desafiobackvoltossouthsystem.baundaries.associado.model;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssociadoRequest {
	
	@NotNull(message = "Campo Obrigatorio")
	@JsonProperty(value = "nome_associado")
	private String nomeAssociado;

	@NotNull(message = "Campo Obrigatorio")
	@JsonProperty(value = "cpf_associado")
	private String cpfAssociado;

}
