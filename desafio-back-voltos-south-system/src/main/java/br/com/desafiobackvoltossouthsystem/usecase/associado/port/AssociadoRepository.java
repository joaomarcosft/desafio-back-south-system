package br.com.desafiobackvoltossouthsystem.usecase.associado.port;

import org.springframework.stereotype.Repository;

import br.com.desafiobackvoltossouthsystem.baundaries.associado.model.Associado;
import br.com.desafiobackvoltossouthsystem.domain.entity.AssociadoEntity;

@Repository
public interface AssociadoRepository {

	AssociadoEntity buscarPorIdAssociado(Integer IdAssociado);
	
	AssociadoEntity buscarPorCpfAssociado(String cpfAssociado);
	
	Associado inserirAssociado( Associado associado);
	
}
