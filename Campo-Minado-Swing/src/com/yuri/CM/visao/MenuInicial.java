package com.yuri.CM.visao;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MenuInicial extends JFrame {
	public MenuInicial() {		
		JFrame telaInicial= new JFrame("Menu Inicial"); 
		JLabel l1= new JLabel("Bem vindo ao jogo Super Minas \nFeito por Raquel Maciel para a Cadeira de Lazer e Jogos"); 
		l1.setBounds(0,0,600,600);
		telaInicial.add(l1);
		telaInicial.setSize(690,438);  
		telaInicial.setLayout(null); 
		telaInicial.setVisible(true);
	}
}
