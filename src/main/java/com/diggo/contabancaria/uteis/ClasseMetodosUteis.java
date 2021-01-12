package com.diggo.contabancaria.uteis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClasseMetodosUteis {
	
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
	
}
