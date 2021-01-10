package com.diggo.contabancaria.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.diggo.contabancaria.domains.Pessoa;

@RestController
@RequestMapping(value="/pessoas")


public class PessoaResource {
	
	public String FormatarData(String data) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataConvertida = null;
		try {
			dataConvertida = formato.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String dataFormatada = formato.format(dataConvertida);
		
		return dataFormatada;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Pessoa> testeRequisicao() throws ParseException {
		

        Pessoa p1 = new Pessoa(1, "Rodrigo Araújo", "rodrigo.a.araujo@hotmail.com", "391.448.356-92", FormatarData("10/01/1990"));
        
        Pessoa p2 = new Pessoa(2, "Roberta Miranda", "roberta.a.miranda@hotmail.com", "391.458.386-12", FormatarData("02/05/1988"));
        
        List<Pessoa> listaPessoa = new ArrayList<>();
		
        listaPessoa.add(p1);
        listaPessoa.add(p2);
        
		return listaPessoa;
	}

}
