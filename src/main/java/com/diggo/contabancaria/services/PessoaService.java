package com.diggo.contabancaria.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diggo.contabancaria.domains.Pessoa;
import com.diggo.contabancaria.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repositorio;
	
	public Pessoa BuscarPessoa(Integer id) {
		
		Optional<Pessoa> obj = repositorio.findById(id);
		
		return obj.orElse(null);
	}
}
