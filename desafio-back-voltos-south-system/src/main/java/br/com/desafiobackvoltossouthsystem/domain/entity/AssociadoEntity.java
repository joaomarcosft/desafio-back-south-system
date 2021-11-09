package br.com.desafiobackvoltossouthsystem.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "associados")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssociadoEntity {

	@Id
	@Column(name = "ID_ASSOCIADO")
	private Integer idAssociado;
	
	@Column(name = "NOME_ASSOCIADO")
	private String nomeAssociado;
	
	@Column(name = "CPF")
	private String cpfAssociado;
	
	@Column(name = "AUTORIZADO")
	private Character autorizado;
}
