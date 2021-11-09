package br.com.desafiobackvoltossouthsystem;

import java.util.TimeZone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "br.com.desafiobackvoltossouthsystem")
@ComponentScan(value = "br.com.desafiobackvoltossouthsystem.usecase.associado.port.AssociadoRepository")
public class DesafioBackVoltosSouthSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		
		SpringApplication.run(DesafioBackVoltosSouthSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		TimeZone.setDefault(TimeZone.getDefault());		
	}

}
