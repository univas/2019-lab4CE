package br.edu.univas.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela3 extends JFrame {

	private JPanel content;
	
	public Tela3() {
		this.setTitle("Aula 3");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		initialize();
	}
	
	private void initialize() {
		content = new JPanel();
		GridBagLayout gbc = new GridBagLayout();
		content.setLayout(gbc);
		this.setContentPane(content);
		
		GridBagConstraints constraints = new GridBagConstraints();
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome");
		constraints.gridx = 0;
		constraints.gridy = 0;
		content.add(nameLabel, constraints);
		
		JTextField nameTextField = new JTextField();
		constraints.gridx = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 1.0;
		content.add(nameTextField, constraints);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail");
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.weightx = 0;
		content.add(emailLabel, constraints);
		
		JTextField emailTextField = new JTextField();
		constraints.gridx = 1;
		constraints.weightx = 1.0;
		content.add(emailTextField, constraints);
		
		JButton addButton = new JButton();
		addButton.setText("Adicionar");
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.weightx = 0;
		constraints.fill = GridBagConstraints.NONE;
		constraints.gridwidth = 2;
		constraints.anchor = GridBagConstraints.CENTER;
		content.add(addButton, constraints);
	}
	
}
