package linguagemSistema;

import java.util.Locale;

public class linguagem {
	public static void main(String[] args) {
		Locale local = Locale.getDefault();
		System.out.printf("O seu sistema est� em: " + local.getDisplayLanguage());
	}
}
