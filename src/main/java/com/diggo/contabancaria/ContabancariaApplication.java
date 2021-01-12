package com.diggo.contabancaria;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.diggo.contabancaria.uteis.ClasseMetodosUteis;

import com.diggo.contabancaria.domains.Pessoa;
import com.diggo.contabancaria.repositories.PessoaRepository;

@SpringBootApplication
public class ContabancariaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContabancariaApplication.class, args);
	}
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	ClasseMetodosUteis util = new ClasseMetodosUteis();
	
	@Override
	public void run(String... args) throws Exception {
		
		Pessoa p1 = new Pessoa(null, "Rodrigo Araújo", "rodrigo.a.araujo@hotmail.com", "394.433.088-6", util.FormatarData("01/12/1990"));
		Pessoa p2 = new Pessoa(null, "Roberta Fernandez", "roberta.fernandez@hotmail.com", "494.553.088-8", util.FormatarData("09/10/1987"));
		
		pessoaRepository.saveAll(Arrays.asList(p1, p2));
		
	}
 
}
