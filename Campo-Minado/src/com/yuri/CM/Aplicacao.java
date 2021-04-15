package com.yuri.CM;

import com.yuri.CM.modelo.Tabuleiro;
import com.yuri.CM.visao.TabuleiroConsole;

public class Aplicacao {
////Main	
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
		
		
	}
}
