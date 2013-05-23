package validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @since 21/05/2013
 * @author Aydalvo Nery Neto
 * @version 0.2.0
 */
public class Validacao {
	
	private static String PATTERN_APENAS_NUMEROS_INTEIROS = "\\d*[^a-zA-Z]";
	private static String PATTERN_APENAS_NUMEROS_COM_DIGITOS = "\\d*[p{.}]\\d*[^a-zA-Z]";

	/**
	 * Metodo para validar se a String recebida como parametro é composta apenas por números.
	 * @param parametro
	 * @return
	 */
	public boolean isStringSemLetras(String parametro, String restricao, String frase) {		
		
		Pattern pattern = Pattern.compile(restricao);
		boolean stringSemLetras = false;
		if (isNotNull(parametro)) {
			Matcher matcher = pattern.matcher(parametro);
			stringSemLetras = matcher.matches();
		}
		
		print(parametro, frase, stringSemLetras);
		
		return stringSemLetras;
	}
	
	/**
	 * 
	 * @param parametro
	 * @param frase
	 * @param teste
	 */
	private void print(String parametro, String frase, boolean teste) {
		System.out.println(parametro + frase + teste);
	}
	
	/**
	 * Metodo para testar se a String recebida como parametro é nula.
	 * @param parametro
	 * @return
	 */
	private boolean isNotNull(String parametro) {		
		return parametro!=null;
	}

}
