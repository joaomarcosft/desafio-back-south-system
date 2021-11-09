package br.com.desafiobackvoltossouthsystem.baundaries.pauta.model;

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
public class PautaRequest {

	@NotBlank(message = "Campo obrigatorio!")
	@JsonProperty(value = "nome_pauta")
	private String nomePautua;

	@NotBlank(message = "Campo obrigatorio!")
	@JsonProperty(value = "descricao_pauta")
	private String descricaoPauta;

	@NotNull(message = "Campo Obrigatorio!")
	@JsonProperty(value = "id_associado")
	private Integer associadoCriacaoId;
	
	@Pattern(regexp = "S|N", message = "Campo invalido!")
	@NotBlank
	@JsonProperty(value = "iniciar_sessao_voto")
	private String iniciarSessaoVoto;

	@JsonProperty(value = "data_inicio_sessao_voto")
	private String dataInicioSessaoVoto;

	@JsonProperty(value = "data_fim_sessao_voto")
	private String dataFimSessaoVoto;
}
