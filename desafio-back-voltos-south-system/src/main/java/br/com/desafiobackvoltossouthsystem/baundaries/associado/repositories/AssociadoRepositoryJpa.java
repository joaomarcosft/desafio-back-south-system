package br.com.desafiobackvoltossouthsystem.baundaries.associado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.desafiobackvoltossouthsystem.domain.entity.AssociadoEntity;

@Repository
public interface AssociadoRepositoryJpa extends JpaRepository<AssociadoEntity, Integer> {
	
	
	@Query("SELECT a FROM AssociadoEntity a where a.cpfAssociado = ?1")
	AssociadoEntity associadoJaExiste(String cpfAssociado);
	
	@Query("SELECT a FROM AssociadoEntity a where a.idAssociado = ?1")
	AssociadoEntity buscarPorIdAssociado(Integer idAssociado);

}
