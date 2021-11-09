package br.com.desafiobackvoltossouthsystem.baundaries.associado.entrypoints;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiobackvoltossouthsystem.baundaries.associado.model.Associado;
import br.com.desafiobackvoltossouthsystem.baundaries.associado.model.AssociadoRequest;
import br.com.desafiobackvoltossouthsystem.baundaries.associado.model.AssociadoResponse;
import br.com.desafiobackvoltossouthsystem.baundaries.associado.model.mapper.AssociadoMapper;
import br.com.desafiobackvoltossouthsystem.usecase.associado.InserirAssociado;

@RestController
@RequestMapping("/associados")
public class AssociadoController {

	@Autowired
	private AssociadoMapper mapper;

	@Autowired
	private InserirAssociado inserirAssociado;

	@PostMapping
	public ResponseEntity<AssociadoResponse> inserirAssociado(@Valid @RequestBody AssociadoRequest request) {

		Associado associado = mapper.requestToDomain(request);

		Associado reponse = inserirAssociado.executar(associado);

		return ResponseEntity.ok(mapper.domaintoReponse(reponse));
	}

	@GetMapping
	public String get() {

		return "Requisição GET";
	}
}
