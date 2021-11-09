package br.com.desafiobackvoltossouthsystem.usecase.sessaovoto.port;

import br.com.desafiobackvoltossouthsystem.baundaries.sessaovoto.model.SessaoVoto;
import br.com.desafiobackvoltossouthsystem.domain.entity.SessaoVotosEntity;

public interface SessaoRepository {

	SessaoVotosEntity buscarSessaoVotosPorId(Integer votoId);
	
	SessaoVoto inserirVoto(SessaoVoto voto);
}
