package br.com.desafiobackvoltossouthsystem.baundaries.associado.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.desafiobackvoltossouthsystem.baundaries.associado.model.Associado;
import br.com.desafiobackvoltossouthsystem.baundaries.associado.model.mapper.AssociadoMapper;
import br.com.desafiobackvoltossouthsystem.domain.entity.AssociadoEntity;
import br.com.desafiobackvoltossouthsystem.usecase.associado.port.AssociadoRepository;

@Repository
public class AssociadoRepositoryImpl implements AssociadoRepository {

	@PersistenceContext
	private EntityManager entityManager;
		
	@Autowired
	private AssociadoMapper mapper;

	@Autowired
	private AssociadoRepositoryJpa associadoRepositoryJpa;
	
//	public AssociadoRepositoryImpl(AssociadoRepositoryJpa associadoRepositoryJpa) {
//		
//		this.associadoRepositoryJpa = associadoRepositoryJpa;
//	}
//	
	@Override
	public AssociadoEntity buscarPorIdAssociado(Integer idAssociado) {
	
		return associadoRepositoryJpa.buscarPorIdAssociado(idAssociado);
	}

	@Override
	@Transactional
	public Associado inserirAssociado(Associado associado) {

		AssociadoEntity associadoEntity = mapper.domainToEntity(associado);
		AssociadoEntity result = associadoRepositoryJpa.save(associadoEntity);

		return mapper.entityToADomain(result);
	}

	@Override
	public AssociadoEntity buscarPorCpfAssociado(String cpfAssociado) {
		
		if (cpfAssociado.isEmpty()) return null;

		AssociadoEntity resultAssociado = associadoRepositoryJpa.associadoJaExiste(cpfAssociado);

		return resultAssociado;
	}

}
