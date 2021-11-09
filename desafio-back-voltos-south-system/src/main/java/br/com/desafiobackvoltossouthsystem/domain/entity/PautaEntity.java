package br.com.desafiobackvoltossouthsystem.domain.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pautas")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PautaEntity {
	
	@Id
	@Column(name = "ID_PAUTA")
	private Integer idPauta;

	@Column(name = "NOME_PAUTA")
	private String nomePauta;
	
	@Column(name = "DESCRICAO_PAUTA")
	private String descricaoPauta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_CRAICAO_ID")
	@Fetch(FetchMode.JOIN)
	private AssociadoEntity associadoCriacao;
	
	@Column(name = "DATA_CRIACAO")
	private LocalDateTime dataCriacaoPauta;
	
	@Column(name = "SN_SESSAO_VOTO")
	private Character snSessaoVoto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_CRIACAO_SESSAO_VOTO_ID")
	@Fetch(FetchMode.JOIN)
	private AssociadoEntity associadoSessao;
	
	@Column(name = "DATA_INICIO_SESSAO_VOTO")
	private LocalDateTime dataInicioSessaoVoto;
	
	@Column(name = "DATA_FIM_SESSAO_VOTO")
	private LocalDateTime dataFimSessaoVoto;
}
