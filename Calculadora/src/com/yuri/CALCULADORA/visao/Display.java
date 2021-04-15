package com.yuri.CALCULADORA.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.yuri.CALCULADORA.modelo.Memoria;
import com.yuri.CALCULADORA.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {
	
	private final JLabel label = new JLabel(Memoria.getInstancia().getTextoAtual());
	
	public Display(){
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50));
		label.setForeground(Color.WHITE);
		label.setFont(new Font("impact", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		add(label);
	}
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
	}
}
