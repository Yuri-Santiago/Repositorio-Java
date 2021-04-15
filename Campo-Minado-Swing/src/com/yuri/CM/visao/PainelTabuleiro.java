package com.yuri.CM.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.yuri.CM.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {
	
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		JOptionPane.showMessageDialog(this, "Jogo Super Minas \nFeito por Raquel Maciel \nDisciplina Lazer e Jogos");

		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		
		tabuleiro.registrarObservador(e -> {
			SwingUtilities.invokeLater(() -> {
				if(e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou! :) \nSe quiser jogar novamente clique aqui em baixo:");
				} else {
					JOptionPane.showMessageDialog(this, "Perdeu! :( \nSe quiser jogar novamente clique aqui em baixo:");				
				}
				
				tabuleiro.reiniciar();
			});	
		});
	}
}
