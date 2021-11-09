package br.com.desafiobackvoltossouthsystem.baundaries.pauta.model.mapper;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import br.com.desafiobackvoltossouthsystem.baundaries.pauta.model.Pauta;
import br.com.desafiobackvoltossouthsystem.baundaries.pauta.model.PautaRequest;
import br.com.desafiobackvoltossouthsystem.baundaries.pauta.model.PautaResponse;
import br.com.desafiobackvoltossouthsystem.domain.entity.AssociadoEntity;
import br.com.desafiobackvoltossouthsystem.domain.entity.PautaEntity;

@Component
public class PautaMapper {

	public Pauta requestToDomain(PautaRequest request) {
		
		return Pauta.builder()
				.nomePauta(request.getNomePautua())
				.descricaoPauta(request.getDescricaoPauta())
				.associadoCriacaoId(request.getAssociadoCriacaoId())
				.dataCriacaoPauta(LocalDateTime.now())
				.snSessaoVoto(request.getIniciarSessaoVoto().charAt(0))
				
				.build();
	}
	
	public Pauta entityToDomain(PautaEntity entity) {
		
//		return Pauta.builder()
//				.idPauta(entity.getIdPauta())
//				.nomePauta(entity.getNomePauta())
//				.descricaoPauta(entity.getDescricaoPauta())
//				.associadoCriacaoId(entity.getAssociadoCriacao().getIdAssociado())
//				.dataCriacaoPauta(entity.getDataCriacaoPauta())
//				.snSessaoVoto(entity.getSnSessaoVoto())
//				.associadoCriacaoSessaoVotoId(entity.getAssociadoSessao().getIdAssociado())
//				.dataInicioSessaoVoto(entity.getDataInicioSessaoVoto())
//				.dataFimSessaoVoto(entity.getDataFimSessaoVoto())				
//				.build();
		
		return null;
	}
	
	public PautaEntity domainToEntity(Pauta domain) {
		
//		Associado criador da Pauta
		AssociadoEntity associadoCriacao = null;
		if(domain.getAssociadoCriacaoId() != null && !domain.getAssociadoCriacaoId().toString().trim().isEmpty()) {
			
			associadoCriacao = AssociadoEntity.builder()
					.idAssociado(domain.getAssociadoCriacaoId())
					.build();
		}
		
//		Associado criador da sessão de voto
		AssociadoEntity associadoSessao = null;
		if(domain.getAssociadoCriacaoSessaoVotoId() !=  null && !domain.getAssociadoCriacaoSessaoVotoId().toString().trim().isEmpty()) {
			
			associadoSessao = AssociadoEntity.builder()
					.idAssociado(domain.getAssociadoCriacaoSessaoVotoId())
					.build();
		}
		
//		return PautaEntity.builder()
//				.nomePauta(domain.getNomePauta())
//				.descricaoPauta(domain.getDescricaoPauta())
//				.associadoCriacao(associadoCriacao)
//				.snSessaoVoto(domain.getSnSessaoVoto())
//				.dataCriacaoPauta(domain.getDataCriacaoPauta())
//				.associadoSessao(associadoSessao)
//				.dataInicioSessaoVoto(domain.getDataInicioSessaoVoto())
//				.dataFimSessaoVoto(domain.getDataFimSessaoVoto())
//				.build();
		
		return null;
	}
	
	public PautaResponse domianToResponse(Pauta domain) {
		
		return PautaResponse.builder()
				.idPauta(domain.getIdPauta())
				.nomePauta(domain.getDescricaoPauta())
				.descricaoPauta(domain.getDescricaoPauta())
				.associadoCriacaoId(domain.getAssociadoCriacaoId())
				.dataCriacaoPauta(domain.getDescricaoPauta())
				.snSessaoVoto(domain.getSnSessaoVoto().toString())
				.associadoCriacaoSessaoVotoId(domain.getAssociadoCriacaoSessaoVotoId())
				.dataInicioSessaoVoto(domain.getDataInicioSessaoVoto().toString())
				.dataFimSessaoVoto(domain.getDataFimSessaoVoto().toString())
				.build();
	}
}
