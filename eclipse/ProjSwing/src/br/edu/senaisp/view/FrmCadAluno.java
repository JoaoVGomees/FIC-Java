package br.edu.senaisp.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrmCadAluno extends JFrame{

	public FrmCadAluno() {
		setTitle("Cadastro de Alunos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton btnOk = new JButton("OK");
		add(btnOk);
		
		setVisible(true);
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.err.println("arrombado");
				
			}
		});
	}
	
	
}
