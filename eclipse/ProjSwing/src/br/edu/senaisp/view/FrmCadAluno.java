package br.edu.senaisp.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.senaisp.dao.AlunoDAO;
import br.edu.senaisp.model.Aluno;

public class FrmCadAluno extends JFrame{

	private Aluno aluno;
	
	public FrmCadAluno() {		
		setTitle("Cadastro de Alunos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel pnl1 = new JPanel();
		pnl1.setSize(400, 300);
		pnl1.setLayout(new FlowLayout());
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10, 10, 30, 20);
		
		JTextField txtNome = new JTextField();
		txtNome.setPreferredSize(new Dimension(100, 20));
		
		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setBounds(10, 10, 30, 20);
		
		JTextField txtCpf = new JTextField();
		txtCpf.setPreferredSize(new Dimension(100, 20));
		
		pnl1.add(lblNome);
		pnl1.add(txtNome);
		pnl1.add(lblCpf);
		pnl1.add(txtCpf);
		add(pnl1);
		
		
		JButton btnGravar = new JButton("Gravar");
		pnl1.add(btnGravar);
		
		setVisible(true);
		
		btnGravar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				aluno = new Aluno(
							txtNome.getText(), 
							txtCpf.getText()
						);
				
				AlunoDAO dao = new AlunoDAO();
				dao.insert(aluno);
				
				System.err.println(aluno.getNome() + " | " + aluno.getCpf());
				JOptionPane.showMessageDialog(null, aluno.getNome() + " | " + aluno.getCpf());
				
				for (Aluno aluno : dao.selectAll()) {
					System.out.println(aluno.getNome());
				}
			}
		});
		
		
//		JTextArea txtArea = new JTextArea(aluno.getNome() + " | " + aluno.getCpf());
//		pnl1.add(txtArea);
	}
	
	
}
