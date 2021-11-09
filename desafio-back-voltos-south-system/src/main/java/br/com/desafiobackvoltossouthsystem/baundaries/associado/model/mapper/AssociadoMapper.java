package br.com.desafiobackvoltossouthsystem.baundaries.associado.model.mapper;

import org.springframework.stereotype.Component;

import br.com.desafiobackvoltossouthsystem.baundaries.associado.model.Associado;
import br.com.desafiobackvoltossouthsystem.baundaries.associado.model.AssociadoRequest;
import br.com.desafiobackvoltossouthsystem.baundaries.associado.model.AssociadoResponse;
import br.com.desafiobackvoltossouthsystem.domain.entity.AssociadoEntity;

@Component
public class AssociadoMapper {

	public Associado requestToDomain(AssociadoRequest request) {
		
		return Associado.builder()
				.nomeAssociado(request.getNomeAssociado())
				.cpfAssociado(request.getCpfAssociado())
				.build();
	}
	
	public Associado entityToADomain(AssociadoEntity entity) {
		
		return Associado.builder()
				.idAssociado(entity.getIdAssociado())
				.nomeAssociado(entity.getNomeAssociado())
				.cpfAssociado(entity.getCpfAssociado())
				.autorizado(entity.getAutorizado())
				.build();
	}
	
	public AssociadoEntity domainToEntity(Associado domain) {
		
		return AssociadoEntity.builder()
				.idAssociado(domain.getIdAssociado())
				.nomeAssociado(domain.getNomeAssociado())
				.cpfAssociado(domain.getCpfAssociado())
				.autorizado(domain.getAutorizado())
				.build();
	}
	
	public AssociadoResponse domaintoReponse(Associado domain) {
		
		return AssociadoResponse.builder()
				.idAssociado(domain.getIdAssociado())
				.nomeAssociado(domain.getNomeAssociado())
				.cpfAssociado(domain.getCpfAssociado())
				.Autorizado(domain.getAutorizado().toString())
				.build();
	}
}
