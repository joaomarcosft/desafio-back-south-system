package br.com.desafiobackvoltossouthsystem.baundaries.pauta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.desafiobackvoltossouthsystem.domain.entity.PautaEntity;


public interface PautaRepositoryJpa extends JpaRepository<PautaEntity, Integer> {

	@Query("SELECT p FROM PautaEntity p where p.idPauta = ?1")
	PautaEntity buscarPautaPorId(Integer idPauta);
}
