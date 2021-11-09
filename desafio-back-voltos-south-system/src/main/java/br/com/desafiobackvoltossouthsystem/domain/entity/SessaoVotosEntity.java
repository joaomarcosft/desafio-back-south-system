package br.com.desafiobackvoltossouthsystem.domain.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "votos")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SessaoVotosEntity {

	@Id
	@Column(name = "ID_VOTO")
	private Integer idVotos;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("idPauta")
	@JoinColumn(name = "PAUTA_ID")
	private PautaEntity pauta;
	
	@Column(name = "VOTO")
	private Character voto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("idAssociado")
	@JoinColumn(name = "ASSOCIADO_ID")
	private AssociadoEntity associado;
	
	@Column(name = "DATA_VOTO")
	private LocalDateTime dataVoto;
}
