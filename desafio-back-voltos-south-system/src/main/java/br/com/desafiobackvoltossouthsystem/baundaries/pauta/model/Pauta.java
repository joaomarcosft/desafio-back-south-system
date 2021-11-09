package br.com.desafiobackvoltossouthsystem.baundaries.pauta.model;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pauta {

	private Integer idPauta;
	
	private String nomePauta;
	
	private String descricaoPauta;
	
	private Integer associadoCriacaoId;
	
	private LocalDateTime dataCriacaoPauta;
	
	@Builder.Default
	private Character snSessaoVoto = 'N';
	
	private Integer associadoCriacaoSessaoVotoId;
	
	private LocalDateTime dataInicioSessaoVoto;
	
	private LocalDateTime dataFimSessaoVoto;
	
}
