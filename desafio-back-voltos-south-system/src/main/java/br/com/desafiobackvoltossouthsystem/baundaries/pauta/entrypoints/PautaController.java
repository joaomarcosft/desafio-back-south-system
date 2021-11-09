package br.com.desafiobackvoltossouthsystem.baundaries.pauta.entrypoints;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafiobackvoltossouthsystem.baundaries.pauta.model.Pauta;
import br.com.desafiobackvoltossouthsystem.baundaries.pauta.model.PautaRequest;
import br.com.desafiobackvoltossouthsystem.baundaries.pauta.model.PautaResponse;
import br.com.desafiobackvoltossouthsystem.baundaries.pauta.model.mapper.PautaMapper;
import br.com.desafiobackvoltossouthsystem.baundaries.pauta.repositories.PautaRepositoryImpl;

@RestController
@RequestMapping("/pautas")
public class PautaController {

	@Autowired
	PautaMapper mapper;
	
	@Autowired
	PautaRepositoryImpl repository;
	
	public ResponseEntity<PautaResponse> inserirPauta(@Valid @RequestBody PautaRequest request) {
		
		Pauta pauta = mapper.requestToDomain(request);
		Pauta response = repository.inserirPauta(pauta);
		
		return ResponseEntity.ok(mapper.domianToResponse(response));
	}
	
	@GetMapping
	public String get() {

		return "Requisição GET";
	}
}
