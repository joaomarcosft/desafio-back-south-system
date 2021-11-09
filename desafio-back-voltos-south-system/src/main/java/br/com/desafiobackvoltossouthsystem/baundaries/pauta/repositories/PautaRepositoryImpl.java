package br.com.desafiobackvoltossouthsystem.baundaries.pauta.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import br.com.desafiobackvoltossouthsystem.baundaries.pauta.model.Pauta;
import br.com.desafiobackvoltossouthsystem.baundaries.pauta.model.mapper.PautaMapper;
import br.com.desafiobackvoltossouthsystem.domain.entity.PautaEntity;
import br.com.desafiobackvoltossouthsystem.usecase.pauta.port.PautaRepository;


@Repository
public class PautaRepositoryImpl implements PautaRepository{

	@Autowired
	private PautaRepositoryJpa pautaRepository;
	
	@Autowired
	private PautaMapper mapper;
	
	@Override
	public PautaEntity buscarPautaPorId(Integer idPauta) {
		
		return pautaRepository.buscarPautaPorId(idPauta);
	}

	@Override
	public Pauta inserirPauta(Pauta pauta) {
		
		PautaEntity entity = mapper.domainToEntity(pauta);
		PautaEntity result = pautaRepository.save(entity);
		
		return mapper.entityToDomain(result);
	}

}
