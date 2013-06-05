package teste;

public class StringValidator {

	protected static String PATTERN_APENAS_NUMEROS_INTEIROS = "\\d*[^a-zA-Z]";
	protected static String PATTERN_APENAS_NUMEROS_COM_DIGITOS = "\\d+[p{.}]\\d*[^a-zA-Z]";
	
	private String parametro;
	private String frase;
	
	public static String getPATTERN_APENAS_NUMEROS_INTEIROS() {
		return PATTERN_APENAS_NUMEROS_INTEIROS;
	}
	public static String getPATTERN_APENAS_NUMEROS_COM_DIGITOS() {
		return PATTERN_APENAS_NUMEROS_COM_DIGITOS;
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
