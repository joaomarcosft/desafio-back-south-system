package br.com.desafiobackvoltossouthsystem.baundaries.associado.model;

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
public class AssociadoResponse {

	
	@JsonProperty(value = "id_associado")
	private Integer idAssociado;
	
	@JsonProperty(value = "nome_associado")
	private String nomeAssociado;
	
	@JsonProperty(value = "cpf_associado")
	private String cpfAssociado;
	
	@JsonProperty(value = "autorizado")
	private String Autorizado;
}
