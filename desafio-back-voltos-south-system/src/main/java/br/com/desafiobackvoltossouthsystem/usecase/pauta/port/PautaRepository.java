package br.com.desafiobackvoltossouthsystem.usecase.pauta.port;

import br.com.desafiobackvoltossouthsystem.baundaries.pauta.model.Pauta;
import br.com.desafiobackvoltossouthsystem.domain.entity.PautaEntity;

public interface PautaRepository {

	PautaEntity buscarPautaPorId(Integer idPauta);
	
	Pauta inserirPauta(Pauta pauta);
}
