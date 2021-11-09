package br.com.desafiobackvoltossouthsystem.baundaries.sessaovoto.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

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
public class SessaoVotoResquest {

	@NotNull(message = "Campo obrigatorio")
	@JsonProperty(value = "id_pauta")
	private Integer pautaId;
	
	@Pattern(regexp = "S|N", message = "Campo invalido!")
	@NotBlank(message = "Campo obrigatorio!")
	@JsonProperty(value = "voto")
	private String voto;
	
	@NotNull(message = "Campo Obrigatorio!")
	@JsonProperty(value = "id_associado")
	private Integer associadoId;
	
}
