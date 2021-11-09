package br.com.desafiobackvoltossouthsystem.usecase.associado.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "$valida.cpf.url", name = "api-valida-associado")
public interface ValidaCpfClien {

	
		@GetMapping(value = "/users/cpf")
		ResponseEntity<?> validaAssociado(@RequestParam("cpf")String cpfAssociado);
}
