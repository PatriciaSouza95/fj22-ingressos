package br.com.caelum.ingresso.model.desconto;

import java.math.BigDecimal;

public class DescontoEstudante implements Desconto {
	private BigDecimal metade = new BigDecimal("2.0");

	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal.divide(metade);
	}
	
	@Override
	public String getDescricao(){
		return "Estudante";
	}
	
	

}
