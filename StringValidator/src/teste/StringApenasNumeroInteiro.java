package teste;

import org.junit.Assert;
import org.junit.Test;

import validator.Validacao;

public class StringApenasNumeroInteiro extends StringValidator {
	
	@Test
	public void apenasLetras() {
		this.setFrase(" é apenas letra? ");
		this.setParametro("aaa([foo])aaa");
		Assert.assertFalse(getValidacao().isStringSemLetras(this.getParametro(), PATTERN_APENAS_LETRAS, this.getFrase()));
	}
	
	@Test
	public void apenasLetras2() {
		this.setFrase(" é apenas letra? ");
		this.setParametro("aaa foo aaa");
		Assert.assertTrue(getValidacao().isStringSemLetras(this.getParametro(), PATTERN_APENAS_LETRAS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaEspacoNoFinal() {
		this.setFrase(" é apenas letra? ");
		this.setParametro("aaa fooaaa ");
		Assert.assertFalse(getValidacao().isStringSemLetras(this.getParametro(), PATTERN_APENAS_LETRAS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaEspacosDuplos() {
		this.setFrase(" palavra sem espaços duplos? ");
		this.setParametro("aaa  fooaaa");
		Assert.assertFalse(getValidacao().isStringSemLetras(this.getParametro(), PATTERN_APENAS_LETRAS, this.getFrase()));
	}
	
	@Test
	public void apenasNumeroNatural() {
		this.setFrase(" é apenas número? ");
		this.setParametro("1234567890");
		Assert.assertTrue(getValidacao().isStringSemLetras(this.getParametro(), PATTERN_APENAS_NUMEROS_INTEIROS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaNumeroComDigitos() {
		this.setFrase(" é número com digito? ");
		this.setParametro("123.45");
		Assert.assertFalse(getValidacao().isStringSemLetras(this.getParametro(), PATTERN_APENAS_NUMEROS_INTEIROS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaStringEmpty() {
		this.setFrase(" é número com digito? ");
		this.setParametro("");
		Assert.assertFalse(getValidacao().isStringSemLetras(this.getParametro(), PATTERN_APENAS_NUMEROS_INTEIROS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaStringNula() {
		this.setFrase(" é número com digito? ");
		this.setParametro(null);
		Assert.assertFalse(getValidacao().isStringSemLetras(this.getParametro(), PATTERN_APENAS_NUMEROS_INTEIROS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaStringAlfaNumericaLower() {
		this.setFrase(" é número com digito? ");
		this.setParametro("123a");
		Assert.assertFalse(getValidacao().isStringSemLetras(this.getParametro().toLowerCase(), PATTERN_APENAS_NUMEROS_INTEIROS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaStringAlfaNumericaUpper() {
		this.setFrase(" é número com digito? ");
		this.setParametro("123a");
		Assert.assertFalse(getValidacao().isStringSemLetras(this.getParametro().toUpperCase(), PATTERN_APENAS_NUMEROS_INTEIROS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaLetra() {
		this.setFrase(" é número com digito? ");
		this.setParametro("John");
		Assert.assertFalse(getValidacao().isStringSemLetras(this.getParametro().toUpperCase(), PATTERN_APENAS_NUMEROS_INTEIROS, this.getFrase()));
	}
	
	@Test
	public void aceitaNumeroInteiroComoDecimal() {
		this.setFrase(" é número sem digito válido? ");
		this.setParametro("12350");
		Assert.assertTrue(getValidacao().isStringSemLetras(this.getParametro(), PATTERN_APENAS_NUMEROS_COM_DIGITOS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaFormatacaoErrada() {
		this.setFrase(" é número com digito válido? ");
		this.setParametro("123..50");
		Assert.assertFalse(getValidacao().isStringSemLetras(this.getParametro().toUpperCase(), PATTERN_APENAS_NUMEROS_COM_DIGITOS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaFormatacaoMilhar() {
		this.setFrase(" é número com digito válido? ");
		this.setParametro("1.234.50");
		Assert.assertFalse(getValidacao().isStringSemLetras(this.getParametro().toUpperCase(), PATTERN_APENAS_NUMEROS_COM_DIGITOS, this.getFrase()));
	}
	
	@Test
	public void bloqueiaComecarComPonto() {
		this.setFrase(" é número com digito válido? ");
		this.setParametro(".23450");
		Assert.assertFalse(getValidacao().isStringSemLetras(this.getParametro().toUpperCase(), PATTERN_APENAS_NUMEROS_COM_DIGITOS, this.getFrase()));
	}
	
	

//	isStringSemLetras(STRING_NUMERO_COM_DIGITO, PATTERN_APENAS_NUMEROS_INTEIROS, frase);
//	isStringSemLetras(STRING_NUMERO_COM_DIGITO_MILHAR, PATTERN_APENAS_NUMEROS_COM_DIGITOS, numeroComDigitoValido);
//	isStringSemLetras(STRING_NUMERO_COM_DIGITO_E_DOIS_PONTOS, PATTERN_APENAS_NUMEROS_COM_DIGITOS, numeroComDigitoValido);

}
