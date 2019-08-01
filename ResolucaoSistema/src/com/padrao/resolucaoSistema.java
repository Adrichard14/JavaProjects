package com.padrao;

import java.awt.Dimension;
import java.awt.Toolkit;

public class resolucaoSistema {
	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		System.out.println("A dimensao da sua tela é: " + d);
	}
}
