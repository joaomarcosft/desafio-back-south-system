package br.com.desafiobackvoltossouthsystem.baundaries.sessaovoto.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SessaoVoto {

	private Integer idVoto;
	
	private Integer pautaId;
	
	private Character voto;
	
	private Integer associadoId;
	
	private LocalDateTime dataVoto;
}
