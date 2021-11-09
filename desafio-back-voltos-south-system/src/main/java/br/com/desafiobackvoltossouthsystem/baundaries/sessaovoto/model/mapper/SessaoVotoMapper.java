package br.com.desafiobackvoltossouthsystem.baundaries.sessaovoto.model.mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import br.com.desafiobackvoltossouthsystem.baundaries.sessaovoto.model.SessaoVoto;
import br.com.desafiobackvoltossouthsystem.baundaries.sessaovoto.model.SessaoVotoResquest;

@Component
public class SessaoVotoMapper {

	public SessaoVoto requestToDomain(SessaoVotoResquest request) {

		return SessaoVoto.builder()
				.pautaId(request.getPautaId())
				.associadoId(request.getAssociadoId())
				.voto(request.getVoto().toString().trim().charAt(0))
				.dataVoto(LocalDateTime.now())
				.build();
	}
	

}
