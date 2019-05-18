package br.edu.univas.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.univas.dao.AlunoDAO;
import br.edu.univas.vo.Aluno;

public class AlunoFrame extends JFrame {

	private JPanel content;
	private JTextField nameTextField;
	private JTextField emailTextField;
	
	public AlunoFrame() {
		this.setTitle("Aula 4");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		initialize();
	}
	
	private void initialize() {
		content = new JPanel();
		content.setLayout(new GridBagLayout());
		this.setContentPane(content);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel titleLabel = new JLabel();
		titleLabel.setText("Cadastro de Alunos");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		content.add(titleLabel, gbc);

		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome:");
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		content.add(nameLabel, gbc);
		
		nameTextField = new JTextField();
		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		content.add(nameTextField, gbc);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0;
		content.add(emailLabel, gbc);
		
		emailTextField = new JTextField();
		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		content.add(emailTextField, gbc);
		
		JButton button = new JButton();
		button.setText("Salvar");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				saveAluno();
				
			}
		});
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.weightx = 0.0;
		content.add(button, gbc);
	}
	
	private void saveAluno() {
		Aluno aluno = new Aluno();
		aluno.setName(nameTextField.getText());
		aluno.setEmail(emailTextField.getText());

		try {
			AlunoDAO dao = new AlunoDAO();
			dao.insert(aluno);
			
			JOptionPane.showMessageDialog(
					null, "Aluno salvo com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(
					null, "Erro ao salvar o aluno!");
			
		}
	}
}
