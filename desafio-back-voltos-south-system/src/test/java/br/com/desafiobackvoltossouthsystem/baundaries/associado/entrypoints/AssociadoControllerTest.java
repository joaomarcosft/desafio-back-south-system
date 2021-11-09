package br.com.desafiobackvoltossouthsystem.baundaries.associado.entrypoints;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import br.com.desafiobackvoltossouthsystem.baundaries.associado.model.Associado;
import br.com.desafiobackvoltossouthsystem.baundaries.associado.model.AssociadoRequest;
import br.com.desafiobackvoltossouthsystem.baundaries.associado.model.AssociadoResponse;
import br.com.desafiobackvoltossouthsystem.baundaries.associado.model.mapper.AssociadoMapper;
import br.com.desafiobackvoltossouthsystem.usecase.associado.InserirAssociado;

public class AssociadoControllerTest {
	

	@Mock
	private AssociadoMapper mapper;

	@Mock
	private InserirAssociado inserirAssociado;

	@InjectMocks
	private AssociadoController associadoController;

	public void inserir_associado_test() {
		
		Associado associadoDoamin = gerarAssociado();
		AssociadoRequest request = new AssociadoRequest();
		AssociadoResponse response = new AssociadoResponse() {
		};
		
		when(mapper.requestToDomain(Mockito.eq(request))).thenReturn(associadoDoamin);
		when(inserirAssociado.executar(associadoDoamin)).thenReturn(associadoDoamin);
		when(mapper.domaintoReponse(associadoDoamin)).thenReturn(response);
		ResponseEntity<?> result = associadoController.inserirAssociado(request);
		assertEquals("200 OK", result.getStatusCode().toString());
		
		
		}
		
		
		
	}

	private Associado gerarAssociado() {

		return Associado.builder()
				.nomeAssociado("nomeAssociado")
				.cpfAssociado("111")
				.build();

	}
}
