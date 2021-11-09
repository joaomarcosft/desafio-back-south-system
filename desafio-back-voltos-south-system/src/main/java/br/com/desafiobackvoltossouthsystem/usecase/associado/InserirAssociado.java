package br.com.desafiobackvoltossouthsystem.usecase.associado;

import java.util.Objects;

import javax.management.RuntimeErrorException;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import br.com.desafiobackvoltossouthsystem.baundaries.associado.model.Associado;
import br.com.desafiobackvoltossouthsystem.domain.entity.AssociadoEntity;
import br.com.desafiobackvoltossouthsystem.usecase.associado.port.AssociadoRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class InserirAssociado {

	private final AssociadoRepository associadoRepository;

	public InserirAssociado(AssociadoRepository associadoRepository) {

		this.associadoRepository = associadoRepository;
	}
	
	@Transactional(dontRollbackOn = RuntimeException.class)
	public Associado executar(Associado associado) {
		
		if(associado == null) return null;
		
		try {
			verificaAassociadoExiste(associado.getCpfAssociado());
			
			return associadoRepository.inserirAssociado(associado);
			
		} catch(RuntimeException e) {
			log.error("Erro ao inserir associado cnpj={}", associado.getCpfAssociado(), e.getMessage());
			throw e;
		}
	}

	private void verificaAassociadoExiste(String cpf) {

		AssociadoEntity associadoJaExist = associadoRepository.buscarPorCpfAssociado(cpf);

		if (Objects.isNull(associadoJaExist)) {

			throw new NullPointerException();
		}
	}
}
