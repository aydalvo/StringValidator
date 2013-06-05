package teste;

import org.junit.Assert;
import org.junit.Test;

import validator.Validacao;

public class StringApenasNumeroInteiro extends StringValidator {
	
	Validacao validacao = new Validacao();
	
	@Test
	public void apenasNumeroNatural() {
		this.setFrase(" é apenas número? ");
		this.setParametro("1234567890");
		Assert.assertTrue(validacao.isStringSemLetras(this.getParametro(), PATTERN_APENAS_NUMEROS_INTEIROS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaNumeroComDigitos() {
		this.setFrase(" é número com digito? ");
		this.setParametro("123.45");
		Assert.assertFalse(validacao.isStringSemLetras(this.getParametro(), PATTERN_APENAS_NUMEROS_INTEIROS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaStringEmpty() {
		this.setFrase(" é número com digito? ");
		this.setParametro("");
		Assert.assertFalse(validacao.isStringSemLetras(this.getParametro(), PATTERN_APENAS_NUMEROS_INTEIROS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaStringNula() {
		this.setFrase(" é número com digito? ");
		this.setParametro(null);
		Assert.assertFalse(validacao.isStringSemLetras(this.getParametro(), PATTERN_APENAS_NUMEROS_INTEIROS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaStringAlfaNumericaLower() {
		this.setFrase(" é número com digito? ");
		this.setParametro("123a");
		Assert.assertFalse(validacao.isStringSemLetras(this.getParametro().toLowerCase(), PATTERN_APENAS_NUMEROS_INTEIROS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaStringAlfaNumericaUpper() {
		this.setFrase(" é número com digito? ");
		this.setParametro("123a");
		Assert.assertFalse(validacao.isStringSemLetras(this.getParametro().toUpperCase(), PATTERN_APENAS_NUMEROS_INTEIROS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaLetra() {
		this.setFrase(" é número com digito? ");
		this.setParametro("John");
		Assert.assertFalse(validacao.isStringSemLetras(this.getParametro().toUpperCase(), PATTERN_APENAS_NUMEROS_INTEIROS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaFormatacaoErrada() {
		this.setFrase(" é número com digito válido? ");
		this.setParametro("123..50");
		Assert.assertFalse(validacao.isStringSemLetras(this.getParametro().toUpperCase(), PATTERN_APENAS_NUMEROS_COM_DIGITOS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaFormatacaoMilhar() {
		this.setFrase(" é número com digito válido? ");
		this.setParametro("1.234.50");
		Assert.assertFalse(validacao.isStringSemLetras(this.getParametro().toUpperCase(), PATTERN_APENAS_NUMEROS_COM_DIGITOS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaComecarComPonto() {
		this.setFrase(" é número com digito válido? ");
		this.setParametro(".23450");
		Assert.assertFalse(validacao.isStringSemLetras(this.getParametro().toUpperCase(), PATTERN_APENAS_NUMEROS_COM_DIGITOS, this.getFrase()));
	}
	
	

//	isStringSemLetras(STRING_NUMERO_COM_DIGITO, PATTERN_APENAS_NUMEROS_INTEIROS, frase);
//	isStringSemLetras(STRING_NUMERO_COM_DIGITO_MILHAR, PATTERN_APENAS_NUMEROS_COM_DIGITOS, numeroComDigitoValido);
//	isStringSemLetras(STRING_NUMERO_COM_DIGITO_E_DOIS_PONTOS, PATTERN_APENAS_NUMEROS_COM_DIGITOS, numeroComDigitoValido);

}
