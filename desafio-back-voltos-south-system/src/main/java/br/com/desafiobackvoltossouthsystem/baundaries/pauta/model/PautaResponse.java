package br.com.desafiobackvoltossouthsystem.baundaries.pauta.model;

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
public class PautaResponse {

	@JsonProperty(value = "id_pauta")
	private Integer idPauta;

	@JsonProperty(value = "nome_pauta")
	private String nomePauta;

	@JsonProperty(value = "descricao_pauta")
	private String descricaoPauta;

	@JsonProperty(value = "id_associado_criacao")
	private Integer associadoCriacaoId;

	@JsonProperty(value = "data_criacao_pauta")
	private String dataCriacaoPauta;

	@JsonProperty(value = "sessao_voto_ativo")
	private String snSessaoVoto;

	@JsonProperty(value = "id_associado_criacao_sessao_voto")
	private Integer associadoCriacaoSessaoVotoId;

	@JsonProperty(value = "data_inicio_sessao_voto")
	private String dataInicioSessaoVoto;

	@JsonProperty(value = "data_fim_sessao_voto")
	private String dataFimSessaoVoto;
}
