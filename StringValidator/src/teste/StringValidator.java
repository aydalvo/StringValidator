package teste;

public class StringValidator {

	protected static String PATTERN_APENAS_LETRAS = "[a-zA-Z]+(\\p{Blank}{0,1}[a-zA-Z]+)*";
	protected static String PATTERN_APENAS_NUMEROS_INTEIROS = "\\d*[^a-zA-Z]";
	protected static String PATTERN_APENAS_NUMEROS_COM_DIGITOS = "\\d+[p{.}]{0,1}\\d*[^a-zA-Z]";
	
	private String parametro;
	private String frase;
	
	public Validacao getValidacao() {
		return criaValidacao();
	}
	
	public Validacao criaValidacao() {
		return new Validacao();
	}
	
	public String getParametro() {
		return parametro;
	}
	public void setParametro(String parametro) {
		this.parametro = parametro;
	}
	public String getFrase() {
		return frase;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	
}
